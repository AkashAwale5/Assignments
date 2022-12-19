package ass11;
// WAP in spring core where we will inject dependent object of result class in student class. In 
//student class following fields will be present studentname, rollno, date of birth, classname, 
//section. Result class will have following fields, rollno, maths,hindi,English, science, as subject 
//name. Create five bean of each and inject the bean as per roll no. Now you need to load the 
//bean from container. Load all the objects in List and filter the data on the basis of total 
//marks obtain by each student.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Student 
{
	String studentname;
	int rollno;
	String dob;
	String classname;
	String section;
	int total;
	Result objResult;//injection zal
	
	public Student()
	{
		
	}
	
	
	public Student(String studentname, int rollno, String dob, String classname, String section, int total,
			Result objResult) {
		super();
		this.studentname = studentname;
		this.rollno = rollno;
		this.dob = dob;
		this.classname = classname;
		this.section = section;
		this.total = total;
		this.objResult = objResult;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Result getObjResult() {
		return objResult;
	}
	public void setObjResult(Result objResult) {
		this.objResult = objResult;
	}
	
	public int getTotal() {
		return objResult.getMaths()+objResult.getHindi()+objResult.getEnglish()+objResult.getScience();
		
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void showdetails(List<Student> slist)
	{
		System.out.println(",,,,,,,,Before Sort...................");
		for (Student s : slist) 
		{
			System.out.println(s.studentname+"   "+s.getTotal());
		}
		
		Comparator<Student> compareTotal = Comparator.comparing(Student:: getTotal);
          
			Collections.sort(slist, compareTotal);
			System.out.println(",,,,,,,,,,after sort Based on total marks,,,,,,,,,,,,,,,,");
			for (Student s : slist) 
			{
				System.out.println(s.studentname+"   "+s.getTotal());
			}
	}
	
}
