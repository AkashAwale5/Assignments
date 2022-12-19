package com.yash.operation;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.DepartmentDao;
import com.yash.dao.EmployeeDao;
import com.yash.dao.IrmDao;
import com.yash.dao.ProjectDao;
import com.yash.model.Department;
import com.yash.model.Employee;
import com.yash.model.Irm;
import com.yash.model.Project;

public class EmployeeOperation
{
	public static void main(String[] args)
	{
		ApplicationContext objctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao eobj= (EmployeeDao) objctx.getBean("empDao");
		Employee obj = new Employee();
			
		IrmDao iobj= (IrmDao) objctx.getBean("irmDao");
		Irm irmobj= new Irm();
		
		ProjectDao pobj=(ProjectDao) objctx.getBean("projectDao");
		Project probj= new Project();
		
		DepartmentDao dobj= (DepartmentDao) objctx.getBean("deptDao");
		Department depobj=new Department();
		
		Scanner sc = new Scanner(System.in);
//-------------------------------------------------|Save Employee Details|---------------------------------------		
//		System.out.println("Enter Employee Id");
//		obj.setEmpid(sc.nextInt());
//		System.out.println("Enter Employee Name ");
//		obj.setEmpname(sc.next());	
//		System.out.println("Enter Employee Designation");
//		obj.setDesignation(sc.next());
//		System.out.println("Enter Employee Birth Date");	
//		obj.setEdob(sc.next());
//		System.out.println("Enter  Date of Joining ");
//		obj.setEdoj(sc.next());
//		System.out.println("enter date of leaving");
//		obj.setEdol(sc.next());	
//		System.out.println("Enter salary");
//		obj.setSalary(sc.nextFloat());
//		System.out.println("Enter Employee Address");
//		obj.setEaddress(sc.next());		
//		System.out.println("Enter Emp Base Location Id");
//		obj.setBaselocation_id(sc.nextInt());
//		System.out.println("Enter Dept Id");
//		obj.setDeptid(sc.nextInt());
//		System.out.println("Enter project ID");
//		obj.setProjected(sc.nextInt());
//		System.out.println("Enter IRM id");
//		obj.setIRMId(sc.nextInt());		
//		eobj.saveEmployee(obj);
		
//--------------------------------------------------------------Operations-----------------------------------------
		//1 Find out number of employee working on different project.
		System.out.println("1.Find out number of employee working on different project.");
		List<Project> allPro = pobj.getAllProject();
		int cnt1=0;
		for (Project p : allPro)
		{
			List<Employee> emplyoee = p.getEmplyoee();
			for (Employee e : emplyoee)
			{
				cnt1++;
			}
		}
		System.out.println("No of employee work on different project :"+cnt1);
		//que2
		System.out.println("2.Print project name with total number of employee working on it.");
		for (Project p : allPro)
		{
			System.out.print("Project Name "+p.getProjectname());
			System.out.println("	Employee working on it "+p.getEmplyoee().size());
		}
		//que 3
		System.out.println("3.Print only IRM details..");//done..
		List<Irm> allirms = iobj.getAllirm();		
		for (Irm irm : allirms)
		{
			System.out.print("Irm ID "+irm.getIrmid());
			System.out.println("   Irm Name "+irm.getIrmname());		
		}
		//Que4
		eobj.MaxSalaryWithbaselocation();
		//q5
		eobj.MaxSalarywithProject();
		//q6
		eobj.MinSalarywithbaselocation();
		//q7
		eobj.MinSalarywithProject();
		//8
		System.out.println("8.Print total number of employees in each department. ");
		List<Department> allDept = dobj.getAllDept();
		for (Department dept : allDept)
		{
			int cnt=0;
			System.out.print("Department Name "+dept.getDname());
			List<Employee> emp = dept.getEmplyoee();
			for (Employee e : emp)
			{
				cnt++;
			}	
			System.out.println("  "+cnt);
		}
		//Que 9
		eobj.getDepartmentWithAvgSalary();
		//10
		System.out.println("10. Print total number of employee working under each project manager.");//done..
		List<Irm> allirm = iobj.getAllirm();		
		for (Irm irm : allirm)
		{
			int count=0;
			System.out.print("Irm Name "+irm.getIrmname());
			List<Employee> emplyoee = irm.getEmplyoee();
			for (Employee emp : emplyoee)
			{
				count++;
			}
			System.out.println("  "+count);
		}
		//11
		System.out.println("11.Print details of projects along with employee working on it");
		List<Project> allProject = pobj.getAllProject();
		for (Project p : allProject)
		{
			System.out.println("Project Id "+p.getProjectid()+"  Project Name "+p.getProjectname());
			List<Employee> emp = p.getEmplyoee();
			for (Employee e : emp)
			{
				System.out.println("  Emp id "+e.getEmpid()+" Employee Name "+e.getEmpname());
			}
		}		
		//12 
		System.out.println("12.Print employee name with IRM names. ");
		List<Employee> emp = eobj.getAllEmployees();
		for (Employee e : emp)
		{
			System.out.print("Employee Name "+ e.getEmpname());
			System.out.println("   Irm name "+e.getIrm().getIrmname());
		}
		
	}

}
