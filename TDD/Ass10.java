package tdd;

import java.util.Scanner;

public class Ass10 
{

	
	public static String concat_String()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Array");
		
		String furits[] =new String [5];
		for (int i = 0; i < furits.length; i++)
		{
			furits[i]=sc.next();
		}
		
		String s="";
		for (int i = 0; i < furits.length; i++)
		{
			if(i== furits.length-1)
			{
			s=s + furits[i];
			}
			else
			{
				s=s + furits[i] + "-";
			}
		}
		System.out.println(s);
			return s;
	}


}
