package com.yash.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Student_test_attempt
{
	@Id
	int staid;
//	int studentid;
//	int qid;
	String marked_answer;
	
	
	@ManyToOne
	Student student;
	
	@ManyToOne//que3
	Test_questions test_que;
//---------------------------------------------------------------------Que5
	@ManyToMany(mappedBy ="sta")  
	Set<Test_questions> tq;
	
		
	public Set<Test_questions> getTq() {
		return tq;
	}
	public void setTq(Set<Test_questions> tq) {
		this.tq = tq;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Test_questions getTest_que() {
		return test_que;
	}
	public void setTest_que(Test_questions test_que) {
		this.test_que = test_que;
	}
	public int getStaid() {
		return staid;
	}
	public void setStaid(int staid) {
		this.staid = staid;
	}
	
	
	public String getMarked_answer() {
		return marked_answer;
	}
	public void setMarked_answer(String marked_answer) {
		this.marked_answer = marked_answer;
	}
	
	
}
