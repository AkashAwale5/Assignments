package com.yash.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Project
{
	@Id
	int projectid;
	String projectname;
	
	//Irm iobj;
	@OneToMany(mappedBy="project",cascade=CascadeType.ALL)
	private List<Employee> emplyoee;

	public int getProjectid() {
		return projectid;
	}

	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public List<Employee> getEmplyoee() {
		return emplyoee;
	}

	public void setEmplyoee(List<Employee> emplyoee) {
		this.emplyoee = emplyoee;
	}
	
}
