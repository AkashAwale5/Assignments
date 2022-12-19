package ass6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Testass6 {

	public static void main(String[] args)
	{
		ApplicationContext objctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		Codeclass obj=(Codeclass) objctx.getBean("tbean");
		obj.method_vowel();

	}

}
