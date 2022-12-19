package ass10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args)
	{
		ApplicationContext objctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		Student obj= (Student) objctx.getBean("mapbean");
		obj.show();

	}

}
