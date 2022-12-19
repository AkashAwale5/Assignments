package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//WAP to create 10 objects of employee class, add all object to arraylist and from arraylist we 
//need to convert this to map and set using stream ap
public class Employee 
{
	String name;
	int salary;
	String dept;
	public Employee(String name, int salary, String dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
}

class Myemployee
{
	public static void main(String[] args)
	{
		Employee obj= new Employee("akash",20000,"trainee");
		Employee obj1= new Employee("Amol",22000,"testing");
		Employee obj2= new Employee("Prakash",23000,"devloper");
		Employee obj3= new Employee("Kiran",24000,"trainee");
		Employee obj4= new Employee("Atul",26000,"test");
		Employee obj5= new Employee("Rajesh",28000,"trainer");
		Employee obj6= new Employee("Karan",30000,"Hr");
		Employee obj7= new Employee("Sandesh",18000,"devloper");
		Employee obj8= new Employee("Sanket",16000,"trainee");
		Employee obj9= new Employee("Manoj",14000,"trainee");
		
		List<Employee> mylist=new ArrayList();
		mylist.add(obj);
		mylist.add(obj1);
		mylist.add(obj2);
		mylist.add(obj3);
		mylist.add(obj4);
		mylist.add(obj5);
		mylist.add(obj6);
		mylist.add(obj7);
		mylist.add(obj8);
		mylist.add(obj9);
		
		
//		for(Employee x:mylist)
//		{
//			System.out.println(x.name+" "+x.salary+" "+x.dept);
//		}
		System.out.println("converted list to Set,,,,");
		Set<String> nameSet=mylist.stream().map(p->p.name).collect(Collectors.toSet());
		System.out.println(nameSet);
		System.out.println("converted list to Map,,,,,");
		Map<String,String> empMap=mylist.stream().collect(Collectors.toMap(p->p.name,p->p.dept));
		System.out.println(empMap);
	}

}
