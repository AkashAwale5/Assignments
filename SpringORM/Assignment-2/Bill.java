package com.yash.model;

import java.sql.Date;

public class Bill 
{
	 int billid;
	 int customerid;
	 Date dateofbill;
	 
	 
	public int getBillid() {
		return billid;
	}
	public void setBillid(int billid) {
		this.billid = billid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public Date getDateofbill() {
		return dateofbill;
	}
	public void setDateofbill(Date dateofbill) {
		this.dateofbill = dateofbill;
	}
	 
}
