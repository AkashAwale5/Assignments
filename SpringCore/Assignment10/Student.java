package ass10;
import java.util.ArrayList;
import java.util.Collections;
//WAP to inject student name and marks into spring bean and you have to use hashmap. Use 
//key as student name and marks as value. And sort all the data and print the records. For 
//example you can inject map in following way.
//<map> 
//<entry key-ref="sunil" value-ref="350"></entry> 
//<entry key-ref="anil" value-ref="401"></entry> 
//</map>
import java.util.HashMap;


public class Student
{
	HashMap< String,Integer> map=new HashMap<String,Integer>();

	public Student(HashMap<String, Integer> map) {
		super();
		this.map = map;
	}
	void show()
	{
		System.out.println("Sorted list based on name:-----");
		ArrayList<String> sortKeys= new ArrayList<String>(map.keySet());
		 Collections.sort(sortKeys);
	        for (String x : sortKeys)
	            System.out.println("Name = " + x + ", Marks = " + map.get(x));
	}
}
	