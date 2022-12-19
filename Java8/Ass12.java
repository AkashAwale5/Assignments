package assignments;

import java.util.ArrayList;
import java.util.List;

public class Ass12
{
	interface MaxNo
	{
		void myarray(int a[]);
	}
	public static void main(String[] args)
	{
		List<Integer> list= new ArrayList<Integer>();
		MaxNo mn=(int a[])->
		{
			for(int i=1;i<a.length;i++)
			{
				list.add(a[i]);
			}
		
		Integer max=list.stream().max((e1,e2)->e1>e2?1:-1).get();
		System.out.println("maximum no is= "+max);
		};
		mn.myarray(new int[] {20,60,76,54,30});
	}
}
