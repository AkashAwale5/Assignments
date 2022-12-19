package ass7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassTest 
{
	 
		public static void main(String[] args)
		{
			ApplicationContext objctx= new ClassPathXmlApplicationContext("applicationContext.xml");
			Class1 obj= (Class1) objctx.getBean("class1bean");
			obj.merge_array();
		}
}
