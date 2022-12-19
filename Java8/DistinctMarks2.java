package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistinctMarks2 
{
  public static void main(String[] args)
  {
	  List<Integer> marks = Arrays.asList(40,45,45,35,42,42,38);
	  System.out.println("The distinct elements are :");	 
	  marks.stream().distinct().forEach(System.out::println);
  }
}
