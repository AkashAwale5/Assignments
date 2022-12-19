package tdd;

public class Ass7
{
	public static boolean palin()
	{
		int num=121;
		int temp=num;
		int sum=0;
		int rem=0;
		while(num>0)
		{
			rem=num%10;
			sum=sum*10 + rem;
			num=num/10;
		}
		if(sum==temp)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
