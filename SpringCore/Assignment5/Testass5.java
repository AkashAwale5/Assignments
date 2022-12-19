package ass5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testass5 {

	public static void main(String[] args)
	{
		ApplicationContext objctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		Array obj=(Array) objctx.getBean("abean");
		obj.show();

	}

}
