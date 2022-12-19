package com.yash.operation;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.BillDao;
import com.yash.dao.CategoryDao;
import com.yash.dao.CustomerDao;
import com.yash.dao.ItemDao;
import com.yash.model.Bill_item;
import com.yash.model.Customer;
import com.yash.model.Item;

public class ItemOperation {

	public static void main(String[] args) 
	{
		ApplicationContext objctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ItemDao iobj= (ItemDao) objctx.getBean("itemdao");
		
		CategoryDao cobj= (CategoryDao) objctx.getBean("catdao");
		CustomerDao custobj= (CustomerDao) objctx.getBean("custdao");
		BillDao bobj= (BillDao) objctx.getBean("billdao");
		
		
		System.out.println("================1) - total number of item in each subcategory==========================");
        Map<String, Integer> slist1 = iobj.getDataByResultSetExtractor1();
        System.out.println("Total number of iteam in subcatagory = " + slist1);

        System.out.println("==============2) Find out total number of item in each category=====================");
		
        Map<String, Integer> slist2 = iobj.getDataByResultSetExtractor1();
        System.out.println("Total number of iteam in catagory = " + slist2);
		
	
		List<Item> ilist=iobj.getAllItem();	
//-------------------------------------------------------------------------------------------------------------------------------------
		//System.out.println("----- Find out total number of item in each category.---");
		List<Item> catData = iobj.getCatData();
		
//------------------------------------------------------------------------------------------------------------------------
		//Find out total number of item which are out of stock
		System.out.println("--------Find out total number of item which are out of stock------------");
		int outcount=0;
		for (Item item : ilist) 
		{
			if(item.getInstock().equals("No"))
			{
				outcount++;
			}
		}
		System.out.println("total number of item which are out of stock is "+outcount);
//------------------------------------------------------------------------------------------------------------------------
		//Total number of items from each category which are out of stock.
		System.out.println("-----------operation 4 assignment 2------------");
		Map<String, Integer> slist4 = iobj.que4();
        System.out.println("Total number of iteam in catagory = " + slist4);
//------------------------------------------------------------------------------------------------------------------------------
	//	5.Print Details of items which are out of stock
		System.out.println();
		System.out.println("Item Details which is out of stock,,,,,,");
		List<Item> allItem = iobj.getAllItem();
		for (Item item : allItem)
		{
			if(item.getInstock().equals("No"))
			{
				System.out.println("item id : "+item.getItemid()+" Item name : "+item.getIname()+" Price : "+item.getPrice()+" Manufacture date : "+item.getDom()+" Expiry date : "+item.getDate_of_expiry());
			}
		}
//--------------------------------------------------------------------------------------------------------------------------------
		//6.Print Details of items which are having price greater than average marks.
		System.out.println();
		System.out.println("Item Details which are greater than average price");
		
		List<Item> list=iobj.getItemsGreater_avg();
		for (Item g : list) 
		{
			System.out.println("item id : "+g.getItemid()+" Item name : "+g.getIname()+" Price : "+g.getPrice()+" Manufacture date : "+g.getDom()+" Discount : "+g.getDiscount());	
		}
//--------------------------------------------------------------------------------------------------------------------------------
		//7.Print Details of item which are having highest discount
		System.out.println();
		System.out.println("-------------Print details which are having highest discount");
		List<Item> hlist=iobj.getHighestDiscount();
		for (Item item : hlist) 
		{
			System.out.println("item id : "+item.getItemid()+" Item name : "+item.getIname()+" Price : "+item.getPrice()+" Manufacture date : "+item.getDom()+" Discount : "+item.getDiscount());
		}
//---------------------------------------------------------------------------------------------------------------------
		//8.Print details of items which are having lowest selling
		System.out.println();
		System.out.println("Items which are having lowest selling");
		List<Item> lowestSelling = iobj.lowestSelling();
		for (Item item : lowestSelling)
		{
			System.out.println("item id : "+item.getItemid()+" Item name : "+item.getIname()+" Price : "+item.getPrice()+" Manufacture date : "+item.getDom()+" Discount : "+item.getDiscount());
		}
//----------------------------------------------------------------------------------------------------------------------------
		System.out.println();
		System.out.println("Items which are having Highest selling");
		List<Item> highestselling = iobj.highestSelling();
		for (Item item : highestselling)
		{
			System.out.println("item id : "+item.getItemid()+" Item name : "+item.getIname()+" Price : "+item.getPrice()+" Manufacture date : "+item.getDom()+" Discount : "+item.getDiscount());
		}
//----------------------------------------------------------------------------------------------------------------------------
		//10. Print details of customer which buy item often.
		System.out.println();
		System.out.println("Details of customer which buy item often.");
		 List<Customer> customerOften = custobj.getCustomerOften();
		 for (Customer cust : customerOften)
		 {
			System.out.println("CustomerId : "+cust.getCustomerid()+" CustName : "+cust.getCustomername()+" Email "+cust.getEmail());
		 }
//---------------------------------------------------------------------------------------------------------------------------------
		 //11. Print details of customer which buy item very less. 
		 System.out.println();
		 System.out.println("Details of customer which buy item very less");
		 List<Customer> lessCustomerOften = custobj.lessCustomerOften();
		 for (Customer cust : lessCustomerOften)
		 {
			 System.out.println("CustomerId : "+cust.getCustomerid()+" CustName : "+cust.getCustomername()+" Email "+cust.getEmail());
				
		 }
//-----------------------------------------------------------------------------------------------------------------------------
		 //12.Print details of those customer whose billing is more than average billing
		 System.out.println();
		 //select * from customer inner join bill on bill.customerid = customer.customerid join bill_item on bill.billid=bill_item.billid where price >(select AVG(price) from bill_item);
		 System.out.println("Customer whose billing is more than average billing");
		 List<Customer> morethanAvgBill = custobj.morethanAvgBill();
		 for (Customer cust : morethanAvgBill)
		 {
			 System.out.println("CustomerId : "+cust.getCustomerid()+" CustName : "+cust.getCustomername()+" Email "+cust.getEmail());
				
		 }
//-------------------------------------------------------------------------------------------------------------------------------
		 //13.Print details of those items which are purchased in given date range.
		 System.out.println();
		 System.out.println("Details of those items which are purchased in given date range.");
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter start date :");
		 String s=sc.next();
		 System.out.println("Enter end date");
		 String s1=sc.next();
		 
		 Date startDate=Date.valueOf(s);
		 Date endDate=Date.valueOf(s1);
		 
		 List<Item> getitembetweendate = iobj.getitembetweendate(startDate,endDate);
		 for (Item item : getitembetweendate)
		 {
			 System.out.println("item id : "+item.getItemid()+" Item name : "+item.getIname()+" Price : "+item.getPrice()+" Manufacture date : "+item.getDom()+" Discount : "+item.getDiscount());
				
		}
//-----------------------------------------------------------------------------------------------------------------------------------
		//14..
		 System.out.println();
		 System.out.println("Total sale of each day");
		 List<Bill_item> totalSale = iobj.totalSale();
		 for (Bill_item item : totalSale)
		 {
			 System.out.println("Date "+item.getBill().getDateofbill()+" Total Sale "+item.getPrice());
		 }
//--------------------------------------------------------------------------------------------------------------------------------		 
		 //15.Print total selling of each day.
		 System.out.println();
		 System.out.println("Print average selling of each day..");
		 List<Bill_item> avgSale = iobj.avgSale();
		 for (Bill_item bill : avgSale)
		 {
			System.out.println("Date "+bill.getBill().getDateofbill()+" Avg Sale "+bill.getPrice());
		}
		 
	}
}
