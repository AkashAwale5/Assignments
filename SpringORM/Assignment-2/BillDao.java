package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.model.Bill;



public class BillDao 
{
	JdbcTemplate objJDBC;

	
	public void setObjJDBC(JdbcTemplate objJDBC) {
		this.objJDBC = objJDBC;
	}
	
}
