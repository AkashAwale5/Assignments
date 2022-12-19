package ass4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ass11.Student;

//WAP to perform demonstrate autowire. Use Two classes, first class Employee, second 
//department now store all employee and department details. Print employee details in order 
//by employee salary 
public class Employee 
{
	int empid;
	String empname;
	int salary;
	
	Department obj2;
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
	public int getSalary() {
			return salary;
		}
	public void setSalary(int salary) {
			this.salary = salary;
		}
	public Department getObj2() {
		return obj2;
	}
	public void setObj2(Department obj2) {
		this.obj2 = obj2;
	}

	void printEmployee()
	  {	  
			System.out.println("Employee Id "+empid);
			System.out.println("Employee Name "+empname);
			System.out.println("Employee salary "+salary);
			System.out.println("Employee dept id "+obj2.id);
			System.out.println("Employee dept name "+obj2.deptname);
			
			
	  }
}
