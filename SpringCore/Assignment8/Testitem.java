package ass8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testitem {

	public static void main(String[] args) 
	{
		ApplicationContext objctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		Item obj= (Item) objctx.getBean("itembean");
		obj.show();
		obj.decending_Order();
		obj.remove_duplicate();

	}

}
