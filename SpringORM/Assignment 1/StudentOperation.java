package com.yash.jdbcdemo;

import java.sql.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.StudentDao;
import com.yash.model.Student;



public class StudentOperation
{
	public static void main(String[] args)
	{
		ApplicationContext objctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDao sobj = (StudentDao) objctx.getBean("studentdao");
		Student obj = new Student();
		
		Scanner sc = new Scanner(System.in);
	//----------------------insert data to student table------------------------
		System.out.println("Enter Student Roll No");
		obj.setSid(sc.nextInt());
		System.out.println("Enter Student Name :");
		obj.setSname(sc.next());
		System.out.println("Enter Father Name");
		obj.setFather_name(sc.next());
		System.out.println("Enter Mother  name");
		obj.setMother_name(sc.next());
		System.out.println("Enter Class Id");
		obj.setClassid(sc.nextInt());
		System.out.println("Enter Address 1");
		obj.setAdd1(sc.next());
		System.out.println("Enter Address 1");
		obj.setAdd2(sc.next());
		System.out.println("Enter Pincode ");
		obj.setPincode(sc.next());
		System.out.println("Enter Adhar No");
		obj.setAadharno(sc.next());
		System.out.println("Enter date of birth");
		String str=sc.next();//"2015-03-31";
		Date date=Date.valueOf(str);//converting string into sql date  
	    System.out.println(date);  
		obj.setDob(date);	
		System.out.println("Enter date of admission");
		String str1=sc.next();
		Date date1=Date.valueOf(str);//converting string into sql date  
		obj.setDate_of_admission(date1);	
		//System.out.println("Student added count : "+sobj.saveDetails(obj));
		
		
	}

	
}
