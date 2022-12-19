package com.yash.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BaseLocation
{
	@Id
	@Column(name="base_id")
	int blocid;
	String blocname;
	
	@OneToMany(mappedBy="baselocation",cascade=CascadeType.ALL)
	private List<Employee> emplyoee;

	public int getBlocid() {
		return blocid;
	}

	public void setBlocid(int blocid) {
		this.blocid = blocid;
	}

	public String getBlocname() {
		return blocname;
	}

	public void setBlocname(String blocname) {
		this.blocname = blocname;
	}

	public List<Employee> getEmplyoee() {
		return emplyoee;
	}

	public void setEmplyoee(List<Employee> emplyoee) {
		this.emplyoee = emplyoee;
	}
	
	
}
