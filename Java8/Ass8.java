package assignments;

import java.util.Scanner;
import java.util.function.Predicate;

public class Ass8
{

	public static boolean check(int num)
	{
		Predicate<Integer> predicate=p->(p%2==0);
		return predicate.test(num);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num to check ");
		int num=sc.nextInt();
		
		if(Ass8.check(num)==true)
		{
			System.out.println("number is Even");
		}
		else
		{
			System.out.println("number is Odd");
		}
	}

}
