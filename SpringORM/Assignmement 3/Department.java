package com.yash.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department 
{
	@Id
	@Column(name="dept_id")
	int deptid;
	String dname;
	
	@OneToMany(mappedBy="department",cascade=CascadeType.ALL)
	private List<Employee> emplyoee;

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public List<Employee> getEmplyoee() {
		return emplyoee;
	}

	public void setEmplyoee(List<Employee> emplyoee) {
		this.emplyoee = emplyoee;
	}
	
}
