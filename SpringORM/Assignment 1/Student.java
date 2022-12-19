package com.yash.model;

import java.sql.Date;

public class Student 
{
	int sid;
	String sname;
	String father_name;
	String mother_name;
	int classid;
	String add1;
	String add2;
	String pincode;
	String aadharno;
	Date dob;
	Date date_of_admission;
	Class1 objclass;
	
	
	
	public Class1 getObjclass() {
		return objclass;
	}
	public void setObjclass(Class1 objclass) {
		this.objclass = objclass;
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
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getMother_name() {
		return mother_name;
	}
	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getAadharno() {
		return aadharno;
	}
	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDate_of_admission() {
		return date_of_admission;
	}
	public void setDate_of_admission(Date date_of_admission) {
		this.date_of_admission = date_of_admission;
	}
	
	

}
