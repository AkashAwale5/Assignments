package com.yash.jdbcdemo;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yash.dao.Class1Dao;
import com.yash.model.Class1;


public class Class1Operation {

	public static void main(String[] args)
	{
		ApplicationContext objctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Class1Dao sobj = (Class1Dao) objctx.getBean("class1dao");
		Class1 obj = new Class1();
		
		Scanner sc = new Scanner(System.in);
	//----------------------insert data to student table------------------------
			System.out.println("Enter Class ID");
			obj.setClassid(sc.nextInt());
			System.out.println("Enter Class Name");
			obj.setClassname(sc.next());
			System.out.println("Enter Class Section :");
			obj.setSectionname(sc.next());
				
			System.out.println("inserted "+sobj.saveDetails(obj));

	}

}
