package com.yash.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.yash.model.Class1;

public class Class1Dao 
{
	JdbcTemplate objJDBC;

	public void setObjJDBC(JdbcTemplate objJDBC)
	{
		this.objJDBC = objJDBC;
	}
	public int saveDetails(Class1 s)
	{
		String query = "insert into class (classid,classname,section)"
				+ "values("+s.getClassid()+",'"+s.getClassname()+"','"+s.getSectionname()+"')";
		return objJDBC.update(query);
	}
}
