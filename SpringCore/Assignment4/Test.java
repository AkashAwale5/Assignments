package ass4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test
{

	public static void main(String[] args)
	{
		 ApplicationContext objCtx= new ClassPathXmlApplicationContext("applicationContext.xml");
		 Employee obj = (Employee) objCtx.getBean("i2");//
		 Employee obj1 = (Employee) objCtx.getBean("i21");
		 Employee obj2 = (Employee) objCtx.getBean("i22");
		 
		 List<Employee> list = new ArrayList<Employee>();
		 list.add(obj);
		 list.add(obj1);
		 list.add(obj2);
		 
		 List<Employee> sorted = list.stream().sorted((e1,e2)->Integer.compare(e1.salary, e2.salary)).collect(Collectors.toList());
		 for (Employee emp : sorted) 
		 {
			emp.printEmployee();
		 }
	}

}
