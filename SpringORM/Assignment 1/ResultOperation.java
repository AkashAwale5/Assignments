package com.yash.jdbcdemo;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.ResultDao;
import com.yash.dao.StudentDao;
import com.yash.model.MergeClass;
import com.yash.model.Result;
import com.yash.model.Student;



public class ResultOperation 
{
	public static void main(String[] args)
	{
		ApplicationContext objctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ResultDao sobj = (ResultDao) objctx.getBean("resultdao");
		Result obj = new Result();
		
		StudentDao studobj=(StudentDao) objctx.getBean("studentdao");
		MergeClass mobj=new MergeClass();
		
		Scanner sc = new Scanner(System.in);
		//----------------------insert data to Result table------------------------
		//- rid, Maths, Hindi,English, science, Sanskrit, sid, datetime
//			System.out.println("Enter Student Roll No");
//			obj.setSid(sc.nextInt());
//			System.out.println("Enter Rid");
//			obj.setRid(sc.nextInt());
//			System.out.println("Enter Math Marks :");
//			obj.setMaths(sc.nextInt());
//			System.out.println("Enter Hindi Marks");
//			obj.setHindi(sc.nextInt());
//			System.out.println("Enter English  Marks");
//			obj.setEnglish(sc.nextInt());
//			System.out.println("Enter science Marks");
//			obj.setScience(sc.nextInt());
//			System.out.println("Enter Sanskrit 1");
//			obj.setSanskrit(sc.nextInt());
//			System.out.println("Enter datetime 1");
//			String date=sc.next();
//			Date date1= Date.valueOf(date);
//			obj.setDatetime(date1);
//			System.out.println("inserted "+sobj.saveDetails(obj));
		
	
//-----------------------------------------------------	Question 1-----------------------------------
		System.out.println("-----Students which are absent in one subject exam------");
		List<Result> allResult = sobj.getAllResult();//result list
		int sub1=0;		
		
		for (Result r : allResult)
		{
			int count=0;	
			if(r.getMaths()==0)
				count++;
			if(r.getEnglish()==0)
				count++;
			if(r.getHindi()==0)
				count++;
			if(r.getSanskrit()==0)
				count++;
			if(r.getScience()==0)
				count++;
	
			if(count==1)
			{	
				sub1++;
				int id=r.getSid();
				List<Student> sinfo= studobj.getDetailsbyId(id);
				for (Student s : sinfo) 
				{
					System.out.println("Roll No- "+s.getSid()+"  Name- "+s.getSname()+" Father Name- "+s.getFather_name());
				}			
			}
		}
		System.out.println("Total no of students "+sub1+" absent in one subject");
		
//----------------------------------------------------Question 2-----------------------------------------------------------
		System.out.println();
		sub1=0;
		System.out.println("Student absent in more than Two subject ");
		for (Result r : allResult)
		{
			int count=0;	
			if(r.getMaths()==0)
				count++;
			if(r.getEnglish()==0)
				count++;
			if(r.getHindi()==0)
				count++;
			if(r.getSanskrit()==0)
				count++;
			if(r.getScience()==0)
				count++;
			if(count >2)
			{
				sub1++;
				int id=r.getSid();
				List<Student> sinfo= studobj.getDetailsbyId(id);
				for (Student s : sinfo) 
				{
					System.out.println("Roll No- "+s.getSid()+"  Name- "+s.getSname()+" Father Name- "+s.getFather_name());
				}
			}
		}
		System.out.println("Student absent in more than Two subject is "+sub1);
		
//--------------------------------operation 3 75%-------------------------
//		Find out total number of students who score more than 75%. and print details of student
		System.out.println();
		System.out.println("---------------Students greater than 75 %-----------------");
		for (Result s : allResult)
		{
			int id=s.getSid();//prasad i=0
			int total= s.getEnglish() + s.getHindi() +s.getMaths() + s.getSanskrit() + s.getScience();
			
			double mark=(total*100)/500;
			if(mark > 75)
			{
				List<Student> sinfo= studobj.getDetailsbyId(id);
				for (Student y : sinfo) 
				{
					System.out.println("Roll No- "+y.getSid()+"  Name- "+y.getSname()+" Father Name- "+y.getFather_name()+" Mark "+mark);
				}	
			}
		}
	//-----------------------------------------------Question 4 ------------------------------------------------------------------------
		System.out.println();
		System.out.println("--------Total number of students who fail to score passing marks----- ");
		for (Result s : allResult)
		{
			int id=s.getSid();
			int total= s.getEnglish() + s.getHindi() +s.getMaths() + s.getSanskrit() + s.getScience();
			
			double mark=(total*100)/500;
			if(mark < 40)
			{
				List<Student> sinfo= studobj.getDetailsbyId(id);
				for (Student y : sinfo) 
				{
					System.out.println("Roll No- "+y.getSid()+"  Name- "+y.getSname()+" Father Name- "+y.getFather_name()+" Mark "+mark);
				}	
			}
		}
//-------------------------------------Question 5----------------------------------------
		// Find out average marks of each class per section.
		System.out.println();
		System.out.println("--------average marks of each class per section----------- ");
		List<MergeClass> jlist=sobj.joinData();
		int total=0,total1=0, total2=0;
		int countEight=0,counte=0,countNine=0;
		for (MergeClass j : jlist)
		{
			if(j.getClassname().equals("eight") && j.getSection().equals("A"))
			{ 
				countEight++;
				total = total + j.getMaths() + j.getEnglish() +j.getHindi() + j.getScience() + j.getSanskrit();
			}
			if(j.getClassname().equals("eight") && j.getSection().equals("B"))
			{	
				counte++;
				total1 = total1 + j.getMaths() + j.getEnglish() +j.getHindi() + j.getScience() + j.getSanskrit();
			}
			if(j.getClassname().equals("Nine") && j.getSection().equals("B"))
			{ 
				countNine++;
				total2 = total2 + j.getMaths() + j.getEnglish() +j.getHindi() + j.getScience() + j.getSanskrit();
			}
			
		}
		System.out.println("Average maraks of Class Eight A = "+(total/countEight));
		System.out.println("Average maraks of Class Eight B = "+(total1/counte));
		System.out.println("Average maraks of Class Nine B = "+(total2/countNine));
//------------------------------------------Que 6--------------------------------------------------------------------
		System.out.println();
		System.out.println("--------average marks of each class ----------- ");
		List<MergeClass> list=sobj.joinData();
		int t=0,t1=0;
		int cnt=0,cnt1=0;
		for (MergeClass j : list)
		{
			if(j.getClassname().equals("eight") )
			{ 
				cnt++;
				t = t + j.getMaths() + j.getEnglish() +j.getHindi() + j.getScience() + j.getSanskrit();
			}
			if(j.getClassname().equals("Nine"))
			{ 
				cnt1++;
				t1 = t1 + j.getMaths() + j.getEnglish() +j.getHindi() + j.getScience() + j.getSanskrit();
			}
			
		}
		System.out.println("Average maraks of Class Eight  = "+(t/cnt));
		System.out.println("Average maraks of Class Nine  = "+(t/cnt1));
//--------------------------------------------Que 7----------------------------------------------------
		//Find out average marks of each subject per class and per section
		System.out.println("-------------------Question 7-------------------------");
		List<Result> stlist7 = sobj.Question1_7();
        for(Result s : stlist7)
        {
        	String cname =s.getObjstud().getObjclass().getClassname();
        	String secName=s.getObjstud().getObjclass().getSectionname();
            System.out.println("classname "+cname+" sectionname " + secName+ " English "+s.getEnglish()+" Hindi "+ s.getHindi()+" Math "+s.getMaths()+" Sanskrit "+s.getSanskrit()+" Science "+s.getScience());
        }
		
		
		
		
	}	
}
