package tdd;

public class Ass4 {

	public static String arm()
	{
		int num=153;
		int temp=num;
		int temp1=temp;
		int count=0;
		
		while(num>0)
		{	
			num=num/10;
			count++;
		}
		double sum=0;
		while(temp>0)
		{
			int rem=temp%10;
			sum=sum + Math.pow(rem, count);	
			temp=temp/10;
		}
		if(temp1==sum)
		{
			return "Armstrong No";
		}
		else
		{
			return "no armstrong No";
		}
		
	}

}
