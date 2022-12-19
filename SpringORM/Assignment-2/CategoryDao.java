package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.model.Item;

public class CategoryDao 
{
//select subcatgory.catid,subcatgory.subcatid,item.item_id, item.iname from subcatgory Join item on item.subcatid = subcatgory.subcatid;
 JdbcTemplate objJDBC;

	
	public void setObjJDBC(JdbcTemplate objJDBC)
	{
		this.objJDBC = objJDBC;
	}


	
	
	
}
