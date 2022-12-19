package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AverageMarks1 
{
 public static void main(String[] args)
 {
	 Scanner sc =new Scanner(System.in);
	
	 List<Integer> mylist = new ArrayList<>();
	 System.out.println("Enter Marks of Student");
	 for(int i=0 ; i < 5 ; i++){
	     mylist.add(sc.nextInt());
	 }
	 
	 double avgmarks = mylist.stream().collect(Collectors.averagingInt(s1 -> s1));
	 System.out.println("Average marks of Student " + avgmarks);
 }
}
