package tdd;

public class Ass2 
{
	
	public  static   boolean palindrome()
	{
		String s1="zyx";
		String s2="xyz";
		

		int i=0;
		char ch[]=s1.toCharArray();
		int j=ch.length-1;
		while(i<j)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		String str1=new String(ch);
		//System.out.println(str1);
		
		if(str1.equals(s2))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public static void main(String[] args) 
	{
		System.out.println(Ass2.palindrome());
	}
}
