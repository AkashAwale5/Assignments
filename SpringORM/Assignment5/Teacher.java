package com.yash.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Teacher
{
	@Id
	int techerid;
	String teachername;
	String email;
	String password;
	
	@OneToMany(mappedBy="obj")//ok que2
	private List<Test> test;
	
	
	
	
	public List<Test> getTest() 
	{
		return test;
	}
	public void setTest(List<Test> test) {
		this.test = test;
	}
	public int getTecherid() {
		return techerid;
	}
	public void setTecherid(int techerid) {
		this.techerid = techerid;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
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
