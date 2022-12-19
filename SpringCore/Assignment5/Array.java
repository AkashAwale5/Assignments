package ass5;

import java.util.Arrays;
import java.util.List;

//WAP to inject n numbers to a bean and find out the maximum out of them using stream operator
public class Array 
{
	Integer a[]=new Integer[10];

	public Array(Integer[] a) 
	{
		super();
		this.a = a;
	}
	void show()
	{		
		List<Integer> list=Arrays.asList(a);
		Integer max=list.stream().max(Integer::compare).get();
		System.out.println(max);
	}
}
