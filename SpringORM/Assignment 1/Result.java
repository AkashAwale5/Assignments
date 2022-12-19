package com.yash.model;

import java.sql.Date;

public class Result 
{
	int rid;
	int Maths;
	int Hindi;
	int English;
	int science;
	int Sanskrit; 
	int sid; 
	Date datetime;
	Student objstud;
	
	
	public Student getObjstud() {
		return objstud;
	}
	public void setObjstud(Student objstud) {
		this.objstud = objstud;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getMaths() {
		return Maths;
	}
	public void setMaths(int maths) {
		Maths = maths;
	}
	public int getHindi() {
		return Hindi;
	}
	public void setHindi(int hindi) {
		Hindi = hindi;
	}
	public int getEnglish() {
		return English;
	}
	public void setEnglish(int english) {
		English = english;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getSanskrit() {
		return Sanskrit;
	}
	public void setSanskrit(int sanskrit) {
		Sanskrit = sanskrit;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	
}
