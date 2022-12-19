package com.yash.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.yash.model.Bill;
import com.yash.model.Bill_item;
import com.yash.model.Item;
import com.yash.model.Subcatgory;


public class ItemDao
{
	JdbcTemplate objJDBC;

	
	public void setObjJDBC(JdbcTemplate objJDBC) {
		this.objJDBC = objJDBC;
	}


	public List<Item> getAllItem()//select * from item
	{
		return objJDBC.query("select * from item inner join Subcatgory on Subcatgory.subcatid = item.subcatid",new RowMapper<Item>()
		 {
			  public Item mapRow(ResultSet rs, int row) throws SQLException
			  {
				  Item obj = new Item();
				  Subcatgory sobj = new Subcatgory();
				  obj.setItemid(rs.getInt("item_id"));
				  obj.setIname(rs.getString("iname"));
				  obj.setSubcatid(rs.getInt("subcatid"));
				  obj.setPrice(rs.getInt("price"));
				  obj.setInstock(rs.getString("instock"));
				  obj.setDom(rs.getDate("dom"));
				  obj.setDate_of_expiry(rs.getDate("date_of_expiry"));
				  obj.setDiscount(rs.getDouble("discount"));
				  sobj.setSubcatname(rs.getString("subcatname"));
				  obj.setSubcat(sobj);
				  return obj;
			  }
		 });
	}
	//----------------------------------------que1------------------------------------------------
	public Map<String, Integer> getDataByResultSetExtractor1() {
        String sqlquery = "select subcatgory.subcatname,count(*) from item inner join subcatgory on item.subcatid=subcatgory.subcatid group by item.subcatid;";
        return objJDBC.query(sqlquery, new ResultSetExtractor<Map<String, Integer>>() {
            public Map<String, Integer> extractData(ResultSet rs) throws SQLException {
                Map<String, Integer> slist = new HashMap<String, Integer>();
                while (rs.next()) {

                    slist.put(rs.getString("subcatname"), rs.getInt("count(*)"));
                }
                return slist;
            }
        });

    }
	//select * from item inner join subcatgory on item.subcatid=subcatgory.subcatid;
	//select subcatgory.catid,subcatgory.subcatid,item.item_id, item.iname from subcatgory Join item on item.subcatid = subcatgory.subcatid
	public List<Item> getCatData()
	{
		return objJDBC.query("select * from item inner join subcatgory on item.subcatid=subcatgory.subcatid",new RowMapper<Item>()
		 {
			  public Item mapRow(ResultSet rs, int row) throws SQLException
			  {
				 Item obj= new Item();
				 Subcatgory objc= new Subcatgory();			 
				 obj.setItemid(rs.getInt("item_id"));
				 obj.setIname(rs.getString("iname"));
				 obj.setInstock(rs.getString("instock"));
				 objc.setCatid(rs.getInt("catid"));
				 objc.setSubcatid(rs.getInt("subcatid"));
				 obj.setSubcat(objc);
				  return obj;
			  }
		 });
	}
//------------------------------------------------------------------------------------------------------------------------
	public Map<String, Integer> que4() {
        String sqlquery = "select category.catname, count(*) from item inner join subcatgory on item.subcatid=subcatgory.subcatid inner join category on category.catid=subcatgory.catid where instock='No' group by category.catname;";
        return objJDBC.query(sqlquery, new ResultSetExtractor<Map<String, Integer>>() {
            public Map<String, Integer> extractData(ResultSet rs) throws SQLException {
                Map<String, Integer> slist = new HashMap<String, Integer>();
                while (rs.next()) {

                    slist.put(rs.getString("catname"), rs.getInt("count(*)"));
                }
                return slist;
            }
        });

    }
//--------------------------------------------------------------------------------------------------------------------------
	public List<Item> getItemsGreater_avg() 
	{
		return objJDBC.query("select * from item where price >(select AVG(price) from item)",new RowMapper<Item>()
		 {
			  public Item mapRow(ResultSet rs, int row) throws SQLException
			  {
				 
				 Item obj= new Item();
				 
				 obj.setItemid(rs.getInt("item_id"));
				 obj.setIname(rs.getString("iname"));
				 obj.setInstock(rs.getString("instock"));
				 obj.setDiscount(rs.getDouble("discount"));
				 obj.setDom(rs.getDate("dom"));
				 obj.setDate_of_expiry(rs.getDate("date_of_expiry"));
				 obj.setPrice(rs.getInt("price"));
				  return obj;
			  }
		 });
	}

//-----------------------------------------------------------------------------------------------------------------------------
	public List<Item> getHighestDiscount()
	{
		return objJDBC.query("select * from item where discount =(select max(discount) from item)",new RowMapper<Item>()
		 {
			  public Item mapRow(ResultSet rs, int row) throws SQLException
			  {
				 
				 Item obj= new Item();	 
				 obj.setItemid(rs.getInt("item_id"));
				 obj.setIname(rs.getString("iname"));
				 obj.setInstock(rs.getString("instock"));
				 obj.setDiscount(rs.getDouble("discount"));
				 obj.setDom(rs.getDate("dom"));
				 obj.setDate_of_expiry(rs.getDate("date_of_expiry"));
				 obj.setPrice(rs.getInt("price"));
				  return obj;
			  }
		 });
	}

//----------------------------------------------------------------------------------------------------------------------------------
	//select * from item inner join Bill_item on Bill_item.itemid = item.item_id;
	//select * from item inner join Bill_item on Bill_item.itemid = item.item_id where bill_item.qty=(select min(qty) from bill_item);
	public List<Item> lowestSelling()
	{
		return objJDBC.query("select * from item inner join Bill_item on Bill_item.itemid = item.item_id where bill_item.qty=(select min(qty) from bill_item)",new RowMapper<Item>()
		 {
			  public Item mapRow(ResultSet rs, int row) throws SQLException
			  { 
				 Item obj= new Item();
				 obj.setItemid(rs.getInt("item_id"));
				 obj.setIname(rs.getString("iname"));
				 obj.setInstock(rs.getString("instock"));
				 obj.setDiscount(rs.getDouble("discount"));
				 obj.setDom(rs.getDate("dom"));
				 obj.setDate_of_expiry(rs.getDate("date_of_expiry"));
				 obj.setPrice(rs.getInt("price"));
				  return obj;
			  }
		 });
	}

//--------------------------------------------------------------------------------------------------------------------------
	public List<Item> highestSelling()
	{
		return objJDBC.query("select * from item inner join Bill_item on Bill_item.itemid = item.item_id where bill_item.qty=(select max(qty) from bill_item)",new RowMapper<Item>()
		 {
			  public Item mapRow(ResultSet rs, int row) throws SQLException
			  {
				 
				 Item obj= new Item();			 
				 obj.setItemid(rs.getInt("item_id"));
				 obj.setIname(rs.getString("iname"));
				 obj.setInstock(rs.getString("instock"));
				 obj.setDiscount(rs.getDouble("discount"));
				 obj.setDom(rs.getDate("dom"));
				 obj.setDate_of_expiry(rs.getDate("date_of_expiry"));
				 obj.setPrice(rs.getInt("price"));
				  return obj;
			  }
		 });
	}
//---------------------------------------------------------------------------------------------------------------------------------
	//select customerid,count(customerid) from bill group by customerid having (count(customerid)>1);
	// select * from item inner join bill_item on bill_item.itemid = item.item_id join bill on bill.billid = bill_item.billid where dateofbill between '2022-07-10' AND '2022-07-12';


	public List<Item> getitembetweendate(Date startDate, Date endDate)
	{	
		return objJDBC.query("select * from item inner join bill_item on bill_item.itemid = item.item_id join bill on bill.billid = bill_item.billid where"
				+ " dateofbill between '"+startDate+"' AND '"+endDate+"'",new RowMapper<Item>()
		 {
			  public Item mapRow(ResultSet rs, int row) throws SQLException
			  {
				 
				 Item obj= new Item();
				 
				 obj.setItemid(rs.getInt("item_id"));
				 obj.setIname(rs.getString("iname"));
				 obj.setInstock(rs.getString("instock"));
				 obj.setDiscount(rs.getDouble("discount"));
				 obj.setDom(rs.getDate("dom"));
				 obj.setDate_of_expiry(rs.getDate("date_of_expiry"));
				 obj.setPrice(rs.getInt("price"));
				  return obj;
			  }
		 });
		
	}
//-----------------------------------------------14--------------------------------------------------------------------------
	public List<Bill_item> totalSale()
	{	
		return objJDBC.query("select dateofbill,sum(price) from bill inner join bill_item on bill.billid=bill_item.billid group by dateofbill",new RowMapper<Bill_item>()
		 {
			  public Bill_item mapRow(ResultSet rs, int row) throws SQLException
			  {
				 
				  Bill_item obj= new Bill_item();
//				  obj.setBillid(rs.getInt("billid"));
//				  obj.setItemid(rs.getInt("itemid"));
				  obj.setPrice(rs.getInt("sum(price)"));
				  Bill objbill = new Bill();
				  objbill.setDateofbill(rs.getDate("dateofbill"));
				  obj.setBill(objbill);
				  return obj;
			  }
		 });
		
	}
//----------------------------------------------------------------------------------------------------------------------------------
	//select dateofbill ,avg(price) from bill inner join bill_item on bill.billid=bill_item.billid group by dateofbill
	public List<Bill_item> avgSale()
	{	
		return objJDBC.query("select dateofbill ,avg(price) from bill inner join bill_item on bill.billid=bill_item.billid group by dateofbill",new RowMapper<Bill_item>()
		 {
			  public Bill_item mapRow(ResultSet rs, int row) throws SQLException
			  {
				 
				  Bill_item obj= new Bill_item();
				  obj.setPrice(rs.getInt("avg(price)"));
				  Bill objbill = new Bill();
				  objbill.setDateofbill(rs.getDate("dateofbill"));
				  obj.setBill(objbill);
				  return obj;
			  }
		 });
		
	}
	
}
