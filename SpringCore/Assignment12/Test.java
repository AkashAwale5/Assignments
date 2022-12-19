package ass12;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext objctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee obj1= (Employee) objctx.getBean("ass12");
		Employee obj2= (Employee) objctx.getBean("ass12a");
		Employee obj3= (Employee) objctx.getBean("ass12b");		
		Employee obj4= (Employee) objctx.getBean("ass12c");		
		List<Employee> list= new ArrayList<Employee>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		
		obj1.show(list);
	}

}
