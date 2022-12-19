package tdd;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import tdd.Item;

class Test15 {

	Item obj= new Item();
	Scanner sc = new Scanner(System.in);
	
	@Test
	void testId()
	{
		System.out.println("Enter Item id:");
		int id=sc.nextInt();
		assertEquals(true, obj.setItemid(id));
	}
	@Test
	void testName()
	{
		System.out.println("Enter Item Name:");
		String name=sc.next();
		assertEquals(true, obj.setItemname(name));
	}
	
	@Test
	void testPrice()
	{
		System.out.println("Enter Item Price:");
		int price=sc.nextInt();
		assertEquals(true, obj.setCost_price(price));
	}
	@Test
	void testSalePrice()
	{
		System.out.println("Enter Item Sale Price:");
		int sprice=sc.nextInt();
		assertEquals(true, obj.setSell_price(sprice));
	}
	@Test
	void testExpiryDate()
	{
		System.out.println("Enter date of expiry");
		String DATE_FORMAT = "yyyy-MM-dd";
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
	    String line = sc.nextLine();
	    LocalDate mdate=LocalDate.parse(line, formatter);		    
	    assertEquals(true, obj.setDoe(mdate));
	}

}
