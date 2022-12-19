package tdd;

import java.util.Scanner;

public class Ass5
{
	public static boolean pythagors()
	{
		Scanner sc = new Scanner(System.in);
		int a[]= new int[3];
		System.out.println("enter three nos");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				for (int k = j+1; k < a.length; k++)
				{
					if(a[i]*a[i]==(a[j]*a[j] + a[k]*a[k]) || a[j]*a[j]==(a[i]*a[i] + a[k]*a[k]) || a[k]*a[k]==(a[j]*a[j] + a[i]*a[i]))
					{
						return true;
					}					
				}
			}
		}
		return false;
	}
//	public static void main(String[] args) 
//	{
//		Ass5 obj2= new Ass5();
//		System.out.println(obj2.pythagors());
//
//	}

}
