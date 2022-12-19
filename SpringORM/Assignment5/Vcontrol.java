package com.yash.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.model.Student;
import com.yash.model.Student_test_attempt;
import com.yash.model.Teacher;
import com.yash.model.Test;
import com.yash.model.Test_questions;
import com.yash.service.StudentService;
import com.yash.service.TeacherService;
import com.yash.service.TestQuestionService;
import com.yash.service.TestService;

@RestController
@RequestMapping("/userapi")
public class Vcontrol {

	@Autowired
	TestService testservice;

	@Autowired
	TeacherService teacherservice;

	@Autowired
	StudentService studentservice;

	@Autowired
	TestQuestionService objTq;

	// Write query to print total number of questions given by each teachers
	@RequestMapping("/que1")
	public void que_by_teacher() {
		List<Teacher> teacher = teacherservice.all_list();
		for (Teacher teacher2 : teacher) {
			int cnt = 0;
			System.out.print("Teacher Name: " + teacher2.getTeachername() + " ");
			List<Test> test = teacher2.getTest();
			for (Test test1 : test) {
				cnt = cnt + test1.getTest_questions().size();
			}
			System.out.println("questions given " + cnt);
		}
	}

	// 2.Write query to print teacher name total number of test created.
	@RequestMapping("/getAllTest")
	public void show_counttest() {
		List<Teacher> teachers = teacherservice.all_list();// all data teacher
		for (Teacher teacher : teachers) {
			System.out.println(" " + teacher.getTeachername() + "  " + teacher.getTest().size());
		}
	}

	// 3.Write query to print student total marks obtained for each test for given
	// student name
	@RequestMapping("/getstudent")
	public void get_marks() {
		List<Student> slist = studentservice.getStudentMarks();
		for (Student s : slist) {
			int marks = 0;
			int sum=0;
			System.out.println(s.getSname());
			List<Student_test_attempt> attemptlist = s.getAttempt();
			for (Student_test_attempt sta : attemptlist) 
			{
				Optional<Test_questions> tq = objTq.getQueBy(sta.getTest_que().getQid());
				String ans = tq.get().getCorrectanswer();
				marks=0;
				if (sta.getMarked_answer().equals(ans)) 
				{
					marks++;
					sum=sum+marks;//ok
					System.out.println("    "+sta.getTest_que().getTest().getTestname()+"   "+marks);					
				}				
			}
			System.out.println("  Total  marks  " + sum);
		}
	}
//------------------------------------------Question 4--------------------------------------------
	//4. Write query to print result of students for teacher by teacher name
	@RequestMapping("/que4")
	public void que4()
	{
		List<Teacher> teachers = teacherservice.all_list();// all data teacher
		for (Teacher teacher : teachers) {

			System.out.println("Teacher Name: " + teacher.getTeachername() + "  ");//print master

			List<Test> test = teacher.getTest();//all test
			for (Test t3 : test) 
			{
				List<Test_questions> tq = t3.getTest_questions();//test questions
				for (Test_questions tq2 : tq) 
				{
					List<Student_test_attempt> sta = tq2.getTestattempt();//attempt test
					int sum=0;
					for (Student_test_attempt sta1 : sta)
					{
						int marks = 0;
						String name = sta1.getStudent().getSname();

						System.out.print("  	 Student " + name);
						String correctanswer = tq2.getCorrectanswer();
						if (sta1.getMarked_answer().equals(correctanswer))
						{
							marks++;
							sum = sum + marks;
						}
						if (marks > 0)
						{
							//System.out.println("Sum "+sum);
							System.out.println("   Marks=" + marks);
						}
						else
							System.out.println("   Fail");
					}
				}
			}

		}
	}
//--------------------------------------------------Question 5-----------------------------------------	
	//5. Count how many test is given by a student
	@RequestMapping("/que5")
	public void getTestCount()
	{
		List<Student> allStudent = studentservice.getAllStudent();//all styudent
		for (Student student : allStudent)
		{
			int count=0;
			int temp=0;
			System.out.print("Student Name : "+student.getSname());
			List<Student_test_attempt> attempt = student.getAttempt();//attemp
			
			for (Student_test_attempt sta : attempt)
			{				
				int qid = sta.getTest_que().getQid();			
				int testid=sta.getTest_que().getTest().getTestid();			
				Optional<Test_questions> que = objTq.getQueBy(qid);				
				int testid2 = que.get().getTest().getTestid();	
				
				if( testid ==testid2 && temp != testid2)
				{
					count++;
					temp=testid2;
				}
			}
			System.out.println("   Test Count : "+count);
		}
	}
//-------------------------------------------------------------------------------------------------------
//----------Calculate average wrong questions attempt by students.
	@RequestMapping("/que6")
	public void avg_wrong_que()
	{
		List<Test_questions> allQuestions = objTq.getAllQuestions();
		int correct=0;
		int wrong=0;
		for (Test_questions test_que : allQuestions)
		{
			
			List<Student_test_attempt> sta = test_que.getTestattempt();
			for (Student_test_attempt sta1 : sta) 
			{
			
				String marked_answer = sta1.getMarked_answer();
				String correctanswer = test_que.getCorrectanswer();
				if(marked_answer.equals(correctanswer))
				{
					correct++;
				}
				else
					wrong++;
			}
			
		}
		double avg=wrong*100/(wrong+correct);
		System.out.println("Wrong average  "+avg);
		
		double avg1=correct*100/(wrong+correct);
		System.out.println("correct average  "+avg1);
		
	}
//--------------------------------------------------------------------------------------------------------
	//. Print details of students who score highest marks in test
	@RequestMapping("/que8")
	public void max_marks()
	{
		int min=0;
		String name="";
		List<Student> allStudent = studentservice.getAllStudent();//student
		for (Student student : allStudent)
		{
			int marks=0;
			List<Student_test_attempt> sta = student.getAttempt();//attempt
			for (Student_test_attempt sta1 : sta)
			{	
				String correctanswer = sta1.getTest_que().getCorrectanswer();
				String marked_answer = sta1.getMarked_answer();
				if(correctanswer.equals(marked_answer))
				{
					marks++;
				}			
			}
			if(min<marks)
			{
				min=marks;
				name=student.getSname();
			}
		}
		System.out.print("Name : "+name);
		System.out.println("  Max Marks : "+min);
	}
//-----------------------------------------Que last-----------------------------------------------------------
	//. Print details of students who score lowest marks in test
		@RequestMapping("/que9")
		public void min_marks()
		{
			int max=Integer.MAX_VALUE;
			String name="";
			List<Student> allStudent = studentservice.getAllStudent();
			for (Student student : allStudent)
			{
				int marks=0;
				List<Student_test_attempt> sta = student.getAttempt();
				for (Student_test_attempt sta1 : sta)
				{	
					String correctanswer = sta1.getTest_que().getCorrectanswer();
					String marked_answer = sta1.getMarked_answer();
					if(correctanswer.equals(marked_answer))
					{
						marks++;
					}
				}
					if(max>marks)
					{
						max=marks;
						name=student.getSname();
					}				
			}
			System.out.print("Name : "+name);
			System.out.println("  Min Marks : "+max);
		}
}
