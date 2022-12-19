package ass2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

	public static void main(String[] args)
	{
		ApplicationContext obj= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		User obj1= (User) obj.getBean("pbean");
		obj1.getUser();
	}

}
