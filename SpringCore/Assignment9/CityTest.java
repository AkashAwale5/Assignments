package ass9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CityTest {

		public static void main(String[] args)
		{
			ApplicationContext objctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	        City sobj = (City) objctx.getBean("sbean");
	        City sobj1 = (City) objctx.getBean("sbean1");
	        sobj.show();
	        sobj1.show();
		}

}
