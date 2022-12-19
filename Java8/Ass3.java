package assignments;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ass3 {

	public static void main(String[] args) 
	{
		List<String> employee=Arrays.asList("akash","prasad","shubham","ajay","ajay");
		
		List < String > sortedList = employee.stream().sorted(Comparator.naturalOrder()).distinct().collect(Collectors.toList());
        System.out.println(sortedList);
        
       // List<String> unique=sortedList.stream().distinct().collect(Collectors.toList());
       // System.out.println(unique);
	}

}
