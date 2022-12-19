package ass1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext objCTX = new ClassPathXmlApplicationContext("applicationContext.xml");
		 item obj = (item) objCTX.getBean("obja");
		 obj.show();
	}

}
