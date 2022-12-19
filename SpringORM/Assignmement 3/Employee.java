package com.yash.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee
{
	@Id
	int empid ;
	String empname ;
	String eaddress ;
	String edob ;
	String edoj ;
	String edol;
	double salary;
	//int deptid ;//
	String designation;
	//int IRMId;//
	//int projected;//
	//int baselocation_id;//
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="dept_id")
	Department department;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="irm_id")
	Irm irm;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pro_id")
	Project project;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="base_id")
	BaseLocation baselocation;

	
	

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public String getEdob() {
		return edob;
	}

	public void setEdob(String edob) {
		this.edob = edob;
	}

	public String getEdoj() {
		return edoj;
	}

	public void setEdoj(String edoj) {
		this.edoj = edoj;
	}

	public String getEdol() {
		return edol;
	}

	public void setEdol(String edol) {
		this.edol = edol;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Irm getIrm() {
		return irm;
	}

	public void setIrm(Irm irm) {
		this.irm = irm;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public BaseLocation getBaselocation() {
		return baselocation;
	}

	public void setBaselocation(BaseLocation baselocation) {
		this.baselocation = baselocation;
	}
	
	
	
	
}
