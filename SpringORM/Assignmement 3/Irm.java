package com.yash.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Irm
{
	@Id
	@Column(name="irm_id")
	int irmid;
	String irmname;
	@OneToMany(mappedBy = "irm",cascade=CascadeType.ALL)
	private List<Employee> emplyoee;
	public int getIrmid() {
		return irmid;
	}
	public void setIrmid(int irmid) {
		this.irmid = irmid;
	}
	public String getIrmname() {
		return irmname;
	}
	public void setIrmname(String irmname) {
		this.irmname = irmname;
	}
	public List<Employee> getEmplyoee() {
		return emplyoee;
	}
	public void setEmplyoee(List<Employee> emplyoee) {
		this.emplyoee = emplyoee;
	}
	
	
}
