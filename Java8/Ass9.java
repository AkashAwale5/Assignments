package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream; 

public class Ass9
{
	
	public static void main(String [] a) 
	{	
		
		List<Integer> list = Arrays.asList(3, 4,5, 6, 7,12,10, 20);	
		int evencount=0;
		int oddcount=0;
		for(Integer n: list) 
		{
			if(Ass9.check(n)==true)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
		}
		System.out.println("Even nos Count- "+evencount);
		System.out.println("Odd nos Count- "+oddcount);
	}
	public static boolean check(Integer list)
	{
		Predicate<Integer> predicate=p->(p%2==0);
		return predicate.test(list);
	}
	
//	long ecount= list.stream().filter(num -> num % 2 == 0).count();
//	long ocount= list.stream().filter(num -> num % 2 != 0).count();
//	
//	System.out.println("there are "+ecount+" Even numbers");
//	System.out.println("there are "+ocount+" Odd numbers");
}