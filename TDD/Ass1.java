package tdd;

import java.util.Scanner;

public class Ass1
{
   public static int hcf()
   {
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter First no");
	   int num=sc.nextInt();
	   System.out.println("Enter second no");
	   int num2= sc.nextInt();
	   int hcf=0;
	   for(int i=1;i<=num || i<=num2;i++)
	   {
		   if(num%i==0 && num2 %i==0)
		   {
			   hcf=i;
			  // System.out.println(i);
		   }
	   }
	return hcf;
	   
   }
}
