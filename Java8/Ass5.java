package assignments;

import java.util.ArrayList;
import java.util.List;

public class Ass5 
{
	
	public static void main(String[] args) 
	{
		String[] str= {"akash","magesh","vikas","kiran","vinod","rushikesh"};
		List<Integer> count= new ArrayList<Integer>();
		for(String s:str)
		{
			int cnt=0;
			char[] arr=s.toCharArray();
			for(char ch:arr)
			{
				cnt++;
			}
			count.add(cnt);
		}
		
		Integer max=count.stream().max((a,b)->a>b?1:-1).get();
		System.out.println("Maximum length of String "+max);

	}

}
