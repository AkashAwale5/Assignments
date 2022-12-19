package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.yash.model.Student;

public class StudentDao
{
	JdbcTemplate objJDBC;

	public void setObjJDBC(JdbcTemplate objJDBC)
	{
		this.objJDBC = objJDBC;
	}
//	public int saveDetails(Student s)
//	{
//		String query = "insert into student (sid,sname,father_name,mother_name,class_id,add1,add2,pincode,aadharno,dob,dateofadmission)"
//				+ "values("+s.getSid()+",'"+s.getSname()+"','"+s.getFather_name()+"','"+s.getMother_name()+"',"+s.getClassid()+",'"+s.getAdd1()+"','"+s.getAdd2()+"','"+s.getPincode()+"','"+s.getAadharno()+"','"+s.getDob()+"','"+s.getDate_of_admission()+"')";
//		return objJDBC.update(query);
//	}
//
	public List<Student> getDetailsbyId(int id) 
	{
		 return objJDBC.query("select * from student where sid="+id,new RowMapper<Student>()
		 {
			  public Student mapRow(ResultSet rs, int row) throws SQLException
			  {
				  Student obj = new Student();
				  obj.setSid(rs.getInt("sid"));
				  obj.setSname(rs.getString("sname"));
				  obj.setFather_name(rs.getString("father_name"));
				  return obj;
			  }
		 });
	}
	
	

	
}
