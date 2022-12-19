package ass2;

import java.util.Scanner;

import javax.annotation.PostConstruct;

//WAP in spring core to read the data using post_construct annotated method by user and
//perform calculation of average of numbers.
public class User 
{
	int num[]=new int[5];
	
	public User(int[] num)
	{
		super();
		this.num = num;
	}
	
	@PostConstruct
	public void getUser () 
	{
		System.out.println("Post Construct is calling");
		System.out.println(get());
	}

	private double get() 
	{
		
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum=num[i] + sum;
		}
		double avg=sum*1.0/num.length;
		return avg;
	}
}
