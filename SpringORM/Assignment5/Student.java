package com.yash.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Student
{
	@Id
	int sid;
	String sname;
	String email;
	String password;
	
	@OneToMany(mappedBy ="student") // que3
	List<Student_test_attempt> attempt;
	
	

	
	
	public List<Student_test_attempt> getAttempt() {
		return attempt;
	}
	public void setAttempt(List<Student_test_attempt> attempt) {
		this.attempt = attempt;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
