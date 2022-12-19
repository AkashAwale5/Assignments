package assignments;

import java.util.Arrays;
import java.util.List;

public class MaximumNo4 {

	public static void main(String[] args)
	{
		Integer myarray[]= {10,45,23,74,20,15};
		List<Integer> list=Arrays.asList(myarray);
		Integer max=list.stream().max(Integer::compare).get();
		System.out.println(max);
	}

}
