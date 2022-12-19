package ass15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext objctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Customer obj= (Customer) objctx.getBean("ass15");
		obj.show_customer();
	}

}
