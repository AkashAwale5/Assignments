package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.yash.model.Customer;

public class CustomerDao 
{
JdbcTemplate objJDBC;

	
	public void setObjJDBC(JdbcTemplate objJDBC)
	{
		this.objJDBC = objJDBC;
	}

	public List<Customer> getCustomerOften()
	{
		return objJDBC.query("select * from customer inner join bill on bill.customerid = customer.customerid group by bill.customerid having(count(bill.customerid)>1)",new RowMapper<Customer>()
		 {
			  public Customer mapRow(ResultSet rs, int row) throws SQLException
			  {
				 
				  Customer obj= new Customer();
				  obj.setCustomerid(rs.getInt("customerid"));
				  obj.setCustomername(rs.getString("customername"));
				  obj.setEmail(rs.getString("email"));
				  obj.setDateofbirth(rs.getDate("dateofbirth"));
				  return obj;
			  }
		 });
	}
	public List<Customer> lessCustomerOften()
	{
		return objJDBC.query("select * from customer inner join bill on bill.customerid = customer.customerid group by bill.customerid having(count(bill.customerid)=1)",new RowMapper<Customer>()
		 {
			  public Customer mapRow(ResultSet rs, int row) throws SQLException
			  {
				 
				  Customer obj= new Customer();
				  obj.setCustomerid(rs.getInt("customerid"));
				  obj.setCustomername(rs.getString("customername"));
				  obj.setEmail(rs.getString("email"));
				  obj.setDateofbirth(rs.getDate("dateofbirth"));
				  return obj;
			  }
		 });
	}
//---------------------------------------------------------------------------------------------------------------------------------
	public List<Customer> morethanAvgBill()
	{
		return objJDBC.query("select * from customer inner join bill on bill.customerid = customer.customerid join bill_item on bill.billid=bill_item.billid where price >(select AVG(price) from bill_item)",new RowMapper<Customer>()
		 {
			  public Customer mapRow(ResultSet rs, int row) throws SQLException
			  {
				 
				  Customer obj= new Customer();
				  obj.setCustomerid(rs.getInt("customerid"));
				  obj.setCustomername(rs.getString("customername"));
				  obj.setEmail(rs.getString("email"));
				  obj.setDateofbirth(rs.getDate("dateofbirth"));
				  return obj;
			  }
		 });
	}
}
