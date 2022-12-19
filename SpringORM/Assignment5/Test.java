package com.yash.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Test
{
	@Id
	int testid;
	String testname;
	//int teacherid;
	
	@ManyToOne//que2
	private Teacher obj;
	
	
	@OneToMany(mappedBy="test")//que1
	private List<Test_questions> test_questions;
	
	public List<Test_questions> getTest_questions() {
		return test_questions;
	}
	public void setTest_questions(List<Test_questions> test_questions) {
		this.test_questions = test_questions;
	}
	public Teacher getObj() {
		return obj;
	}
	public void setObj(Teacher obj) {
		this.obj = obj;
	}
	public int getTestid() {
		return testid;
	}
	public void setTestid(int testid) {
		this.testid = testid;
	}
	public String getTestname() {
		return testname;
	}
	public void setTestname(String testname) {
		this.testname = testname;
	}
	
	
}
