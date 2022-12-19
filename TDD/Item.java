package tdd;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
//Assignment 15
public class Item 
{
 
	int itemid;
	String itemname;
	static int cost_price;
	int sell_price;
	LocalDate dom;
	LocalDate doe;
	
	public  int getItemid() 
	{
		return itemid;
	}
	public boolean setItemid(int itemid)
	{
		//this.itemid = itemid;
		int cnt=0;
		int temp=itemid;
		while(itemid>0)
		{
			itemid=itemid/10;
			cnt++;
		}
		if(cnt>=3)
		{
		this.itemid=temp;
		return true;
		}
		else
		{
			System.out.println("Enter 3 digit id");
		}
		return false;
		
	}
	
	public String getItemname() {
		return itemname;
	}
	public boolean setItemname(String itemname)
	{
		int cnt=0;
		for(int i=0;i<itemname.length();i++)
		{
			char ch= itemname.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A'&& ch<='Z')
			{
				cnt++;
			}
		}
		if(cnt==itemname.length())
		{
			this.itemname = itemname;
			return true;
		}
		else
		{
			System.out.println("Enter only alphabets");
		}
		return false;
		
	}
	public int getCost_price() {
		return cost_price;
	}
	public boolean setCost_price(int cost_price)
	{
		if(cost_price>0)
		{
		this.cost_price = cost_price;
		
		return true;
		}
		else
			System.out.println("enter price greater than zero");
		return false;
	}
	
	public int getSell_price() 
	{
		return sell_price;
	}
	
	public boolean setSell_price(int sell_price )
	{
		if(cost_price != sell_price)
		{
		this.sell_price = sell_price;
		return true;
		}
		else
		{
			System.out.println("sell price and cost price cannot be same");
		}
		return false;
	}
	
	
	
	public LocalDate getDoe() {
		return doe;
	}
	public boolean setDoe(LocalDate doe)
	{
	 if(doe.compareTo(LocalDate.now())!=0)	
	 {
		this.doe = doe;
		return true;
	 }
	 else
	 {
		 System.out.println("enter different date than today");
	 }
	return false;
	}
//	public static void main(String[] args) 
//	{
//		Item obj= new Item();
//		Scanner sc= new Scanner(System.in);
////		System.out.println("enter id");		
////		obj.setItemid(sc.nextInt());
////		System.out.println("enter item name");
////		obj.setItemname(sc.next());
//		System.out.println("enter cost price");
//		//obj.setCost_price(sc.nextInt());
//		System.out.println("enetr sell price");
//		obj.setSell_price(sc.nextInt());
//		System.out.println("enter expiry date");
//		
//		String DATE_FORMAT = "yyyy-MM-dd";
//	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
//	    String line = sc.nextLine();
//	    LocalDate mdate=LocalDate.parse(line, formatter);		    
//		obj.setDoe(mdate);
//		
	//}
	
}
