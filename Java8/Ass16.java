package assignments;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ass16 
{
	// item name, price, date of manufacturing, date of expiring, category name. 
	String iname;
	String category;
	double price;
	LocalDate dom;
	LocalDate eom;
		
	public Ass16(String iname, String category, double price, LocalDate dom, LocalDate eom)
	{
		super();
		this.iname = iname;
		this.category = category;
		this.price = price;
		this.dom = dom;
		this.eom = eom;
	}
}

class Ass16main
	{
	
	public static void main(String[] args)
	{
		List<Ass16> itemlist=new ArrayList<>();
		itemlist.add(new Ass16("shirt", "clothes", 600, LocalDate.of(2022, 1, 03), null));
		itemlist.add(new Ass16("Oil", "home", 2100, LocalDate.of(2022, 2, 03),  LocalDate.of(2022, 12, 03)));
		itemlist.add(new Ass16("trimmer", "electronics", 1600, LocalDate.of(2022, 1, 03), null));
		itemlist.add(new Ass16("milk", "food", 80, LocalDate.of(2022, 06, 15), LocalDate.of(2022, 06, 30)));
		itemlist.add(new Ass16("thums-up", "colddrink", 90, LocalDate.of(2022, 1, 05), LocalDate.of(2022, 07, 15)));
	//-----------------------------------------------------------------------------------------------------
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a date : ");				
//	    LocalDate mdate=LocalDate.parse(sc.nextLine());
//	    System.out.println(mdate);
		String DATE_FORMAT = "yyyy,MM,dd";
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
	    String line = sc.nextLine();
	    LocalDate mdate=LocalDate.parse(line, formatter);
	   // System.out.println(mdate);
	    List<Ass16> names=itemlist.stream().filter(e->e.dom.compareTo(mdate)==0).collect(Collectors.toList());
	    
		for(Ass16 list1:names)
		{
			System.out.println("item name= "+list1.iname+" price= "+list1.price+" date of manufacture "+list1.dom+" date of expiry "+list1.eom );
		}	
	//----------------------------------------------------------------------------------------------------------	
		System.out.println("Enter category ");
		String cat=sc.next();
		List<Ass16> ilist=itemlist.stream().filter(e->e.category.equals(cat)).collect(Collectors.toList());
		for(Ass16 list1:ilist)
		{
			System.out.println("item name= "+list1.iname+" price= "+list1.price+" date of manufacture "+list1.dom+" date of expiry "+list1.eom );
		}
//	//---------------------------------------------------------------------------------------------------	
		System.out.println("Enter Starting letter of item,,, ");
		String start=sc.next();
		List<Ass16> itemnames=itemlist.stream().filter(e->e.iname.startsWith(start.toLowerCase())).collect(Collectors.toList());
		for(Ass16 s:itemnames)
		{
			System.out.println("item name= "+s.iname+" category "+s.category+" price= "+s.price+" date of manufacture "+s.dom+" date eom "+s.eom );	
		}
	
	//---------------------------------------------------------------------------------------------------
		System.out.println("Enter price to check the item under price");
		double startprice=sc.nextDouble();
		double endprice=sc.nextDouble();
		List<Ass16> slist=itemlist.stream().filter(e->e.price>=startprice && e.price<=endprice).collect(Collectors.toList());
		for(Ass16 i:slist)
		{
			System.out.println("item name= "+i.iname+" price= "+i.price+" date of manufacture "+i.dom+" date of expiry "+i.eom );	
		}
	//-------------------------------------------------------------------------------------------------------------
			
	}

}
