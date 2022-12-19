package ass11;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test11 {

	public static void main(String[] args)
	{
		ApplicationContext objctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		Student obj= (Student) objctx.getBean("testbean");
		Student obj1= (Student) objctx.getBean("testbean1");
		Student obj2= (Student) objctx.getBean("testbean2");
		Student obj3= (Student) objctx.getBean("testbean3");
		Student obj5= (Student) objctx.getBean("testbean5");
		List<Student> slist= new ArrayList<Student>();
		slist.add(obj);
		slist.add(obj1);
		slist.add(obj2);
		slist.add(obj3);
		slist.add(obj5);
		
		
//		for (Student s : slist)
//		{
//			System.out.println(s.getRollno()+" "+s.getStudentname()+" "+s.getClassname()+" "+s.getDob()+" "+s.getObjResult().maths);
//		}
		
		obj.showdetails(slist);

	}

}
