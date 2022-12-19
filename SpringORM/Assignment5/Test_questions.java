package com.yash.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Test_questions
{
	@Id
	int qid;
	//int testid;
	String question;
	String answer1;
	String answer2;
	String answer3;
	String answer4; 
	String correctanswer;
	
	@ManyToOne //que1
	Test test;
	
	@OneToMany(mappedBy ="test_que")//que3
	List<Student_test_attempt> testattempt;
//------------------------------------------Que5--------------------------------------------
	@ManyToMany
	Set<Student_test_attempt> sta;
	
	
	
	
	
	public Set<Student_test_attempt> getSta() {
		return sta;
	}
	public void setSta(Set<Student_test_attempt> sta) {
		this.sta = sta;
	}
	public List<Student_test_attempt> getTestattempt() {
		return testattempt;
	}
	public void setTestattempt(List<Student_test_attempt> testattempt) {
		this.testattempt = testattempt;
	}
		public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer1() {
		return answer1;
	}
	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}
	public String getAnswer2() {
		return answer2;
	}
	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
	public String getAnswer3() {
		return answer3;
	}
	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}
	public String getAnswer4() {
		return answer4;
	}
	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}
	public String getCorrectanswer() {
		return correctanswer;
	}
	public void setCorrectanswer(String correctanswer) {
		this.correctanswer = correctanswer;
	}
	
	
}
