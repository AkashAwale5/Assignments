package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ass7
{
	String iname;
	double price;
	public Ass7(String iname, double price) 
	{
		super();
		this.iname = iname;
		this.price = price;
	}
	
}
class Ass7main
{
	public static void main(String[] args) 
	{
		List<Ass7> ilist= new ArrayList<Ass7>();
		ilist.add(new Ass7("bag", 400));
		ilist.add(new Ass7("shirts", 475));
		ilist.add(new Ass7("pant", 450));
		ilist.add(new Ass7("perfume", 470));
		ilist.add(new Ass7("shoes", 471));
		
		System.out.println("Items those price are even");
		List<Ass7> list =ilist.stream().filter(e->e.price%2==0).collect(Collectors.toList());
		for(Ass7 products:list)
		 {
		 System.out.println("item name = "+products.iname+" item price= "+products.price);
		 }
	}

}
