package ass12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



//. WAP in which you will enter employee detail and department names. Now you have to 
//found the following.
//a. Find maximum salary in a department. 
//b. Print name of employees having highest salary
//c. Name of employee having salary less than or equal to average salary.
//d. Average salary of each department.

public class Employee 
{
	int empid;
	String empname;
	String dept;
	int salary;
	
	public Employee(int empid, String empname, String dept, int salary) 
	{
		super();
		this.empid = empid;
		this.empname = empname;
		this.dept = dept;
		this.salary = salary;
	}
	
	
	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public void show(List<Employee> list2)
	{
		Employee obj = list2.stream().max((s1,s2)->s1.salary > s2.salary ? 1:-1).get();
		System.out.println("maximum salary is : "+obj.salary);
	//--------------------------------------------------------------------------------------------------------
		System.out.println("highest salary of Employee : ");
		Employee emp = list2.stream().max((s1,s2)->s1.salary > s2.salary ?1:-1).get();
		System.out.println(emp.empid+" "+emp.empname+"  "+emp.salary);
	//--------------------------------------------------------------------------------------------------------	
		Double avg = list2.stream().collect(Collectors.averagingInt(s1->s1.salary));
		List<Employee> list = list2.stream().filter(s1->s1.salary<= avg).collect(Collectors.toList());
		System.out.println("Employees salary less than Average Salary : ");
		for (Employee e : list)
		{
			System.out.println(e.empid+"  "+e.empname+"  "+e.salary);
		}
	//-------------------------------------------------------------------------------------------------------------
		System.out.println("Average salary of test department : ");
		Double collect = list2.stream().filter(e->e.dept.endsWith("test")).collect(Collectors.averagingInt(s1->s1.salary));
		System.out.println(collect);
		System.out.println("Average salary of devloper department : ");
		Double collect1 = list2.stream().filter(e->e.dept.endsWith("devloper")).collect(Collectors.averagingInt(s1->s1.salary));
		System.out.println(collect1);
		
	}
	
}
