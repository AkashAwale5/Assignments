package com.yash.model;

import java.sql.Date;

public class Item//model getter setter close
{
	
	int itemid;
	String iname;
	int price;
	Date dom;
	Date date_of_expiry;
	String instock;
	double discount;
	int subcatid;
	
	Subcatgory subcat;
	
	
	public Subcatgory getSubcat() {
		return subcat;
	}
	public void setSubcat(Subcatgory subcat) {
		this.subcat = subcat;
	}
	public int getSubcatid() {
		return subcatid;
	}
	public void setSubcatid(int subcatid) {
		this.subcatid = subcatid;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getDom() {
		return dom;
	}
	public void setDom(Date dom) {
		this.dom = dom;
	}
	public Date getDate_of_expiry() {
		return date_of_expiry;
	}
	public void setDate_of_expiry(Date date_of_expiry) {
		this.date_of_expiry = date_of_expiry;
	}
	public String getInstock() {
		return instock;
	}
	public void setInstock(String instock) {
		this.instock = instock;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
}
