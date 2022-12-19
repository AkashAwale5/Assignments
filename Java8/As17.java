package assignments;

import java.time.LocalDate;

import java.time.Period;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class As17
{
	String name;
	String location;
	LocalDate doj;
	LocalDate dob;
	LocalDate doresign;
	String dept;
	int salary;
	
	public As17(String name, String location, LocalDate doj, LocalDate dob, LocalDate doresign, String dept,
			int salary)
	{
		super();
		this.name = name;
		this.location = location;
		this.doj = doj;
		this.dob = dob;
		this.doresign = doresign;
		this.dept = dept;
		this.salary = salary;		
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public LocalDate getDoresign() {
		return doresign;
	}

	public void setDoresign(LocalDate doresign) {
		this.doresign = doresign;
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
	
	
		@Override
		public String toString()
		{
		return "[name=" + name + ", location=" + location + ", doj=" + doj + ", dob=" + dob + ", doresign="
				+ doresign + ", dept=" + dept + ", salary=" + salary + "]";
		}

		public static void main(String[] args)
		{
			List<As17> list= new ArrayList<As17>();
			list.add(new As17("sagar", "pune", LocalDate.of(2022, 04, 05),LocalDate.of(1995,06,23),LocalDate.of(2025,04,05), "JAVA",22000));
			list.add(new As17("Saurabh", "Karad", LocalDate.of(2022, 05, 24),LocalDate.of(1999,07,02),LocalDate.of(2025,03,18), "AWS",35000));
			list.add(new As17("Vishal", "Indore", LocalDate.of(2022, 06, 05),LocalDate.of(1992,04,05),LocalDate.of(2025,02,11), "JAVA",20000));
			list.add(new As17("Manthan", "Banglore", LocalDate.of(2022, 04, 27),LocalDate.of(1998,05,05),LocalDate.of(2025,07,10), "AWS",29000));
			list.add(new As17("Sachin", "Baramati", LocalDate.of(2022, 04, 05),LocalDate.of(1995,05,05),LocalDate.of(2025,05,19), "JAVA",22000));
			
//------------------------------------------------------------------------------------------------------------			
			System.out.println(list);
			System.out.println("------------------Average salaries by each department,,,,,,,,,,,,,,,,,,,,,");
			Double totalavgByDep1=list.stream().filter(Dept ->"JAVA" == Dept.getDept()).collect(Collectors.averagingDouble(As17::getSalary));
			Double totalavgByDep2=list.stream().filter(Dept ->"AWS" == Dept.getDept()).collect(Collectors.averagingDouble(As17::getSalary));
			System.out.println("Total Avg Employees salary of JAVA dep :"+ totalavgByDep1);
			System.out.println("Total Avg Employees salary of AWS dep :"+ totalavgByDep2);
//----------------------------------------------------------------------------------------------------------------------------------			
			// Highest and lowest salary of each department
			System.out.println("--------------------------Highest and lowest salary of each department-------------------");
			int maxSalary = list.stream().filter(Deptm ->"JAVA" ==Deptm.getDept()).map(As17::getSalary).max(Integer::compare).get();
			System.out.println("maxmium salary of java dept:- " +maxSalary);
			int minSalary = list.stream().filter(Deptm ->"JAVA" ==Deptm.getDept()).map(As17::getSalary).min(Integer::compare).get();
			System.out.println("Minimum  salary of java dept:- " +minSalary);
			
			int maxSalary1 = list.stream().filter(Deptm ->"AWS" ==Deptm.getDept()).map(As17::getSalary).max(Integer::compare).get();
			System.out.println("maxmium  salary of AWS dept:- " +maxSalary1);
			int minSalary1 = list.stream().filter(Deptm ->"AWS" ==Deptm.getDept()).map(As17::getSalary).min(Integer::compare).get();
			System.out.println("Minimum  salary of AWS dept:- " +minSalary1);
//---------------------------------------------------------------------------------------------------------------------------------------			
			// Department with highest no of employee and lowest
			System.out.println("------------Department with highest no of employee and lowest----------------------");
			String deptt1= list.stream().map(As17::getDept).max(String::compareTo).get();
			String deptt2= list.stream().map(As17::getDept).min(String::compareTo).get();
			
			System.out.println("Department with highest no of employee:- "+ deptt1);
			System.out.println("Department with lowest no of employee:- "+ deptt2);
			
			
//			long maxcount=list.stream().filter(e->e.dept.equals("JAVA")).count();
//			System.out.println(maxcount);
			
//----------------------------------------------------------------------------------------------------------------------	
			//Total number of years of experience of each employee.
			System.out.println("------------------No of Experience In years of each Employee-------");
			for(As17 e:list)
			{
				if(e.doresign!=null )
				{
				int exp=Period.between(e.doj, e.doresign).getYears();
				System.out.println(e.name+" Experience "+exp+" Years.");
				}
			}
//---------------------------------------------------------------------------------------------------------------------------------	
			//Upcoming birthday and job anniversary in current month from current date to last date of month
			System.out.println(" ---------------Upcoming birthday and job anniversary Employee-------");
			
			LocalDate currentdate=LocalDate.now();
			
			List<As17> bnames=list.stream().filter(e->e.dob.getDayOfMonth()>=currentdate.getDayOfMonth()).collect(Collectors.toList());
			for (As17 a : bnames)
			{
				System.out.println("Birth day of "+a.name+" and Birth Date is "+a.dob);
			}
			List<As17> bnames1=list.stream().filter(e->e.doj.getDayOfMonth()>=currentdate.getDayOfMonth()).collect(Collectors.toList());
			for (As17 a : bnames1)
			{
				System.out.println("Job Anniversary of "+a.name+" and Anniversary Date is "+a.doj);
			}
		}
		

		
	}
