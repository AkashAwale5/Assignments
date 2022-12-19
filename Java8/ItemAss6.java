package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ItemAss6 
{
	//WAP to create list of item price whose price is less than avg price of all item.
	String itemname;
	double price;
	public ItemAss6(String itemname, double price)
	{
		super();
		this.itemname = itemname;
		this.price = price;
	}
	
}
class Item_main
{
	public static void main(String[] args)
	{
		List<ItemAss6> ilist= new ArrayList<>();
		ilist.add(new ItemAss6("t-shirt", 400));
		ilist.add(new ItemAss6("Bag", 600));
		ilist.add(new ItemAss6("shoes", 850));
		ilist.add(new ItemAss6("Jeans", 750));
		ilist.add(new ItemAss6("Perfume", 200));
		
		 double avgprice = ilist.stream().collect(Collectors.averagingDouble(s1 -> s1.price));
		// System.out.println(avgprice);
		 
		 List<ItemAss6> pname = ilist.stream().filter(e->e.price<=avgprice).collect(Collectors.toList());
		 System.out.println("items under Average price");
		 for(ItemAss6 products:pname)
		 {
		 System.out.println("item name = "+products.itemname+" item price= "+products.price);
		 }
		 
		 
	}

}
