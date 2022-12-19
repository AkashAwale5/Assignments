package com.yash.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.yash.model.Class1;
import com.yash.model.MergeClass;
import com.yash.model.Result;
import com.yash.model.Student;



public class ResultDao 
{
	JdbcTemplate objJDBC;

	public void setObjJDBC(JdbcTemplate objJDBC)
	{
		this.objJDBC = objJDBC;
	}
//	public int saveDetails(Result s)
//	{
//		String query = "insert into result (rid,Maths,English,science,sanskrit,sid,datetime)"
//				+ "values("+s.getRid()+","+s.getMaths()+","+s.getEnglish()+","+s.getScience()+","+s.getSanskrit()+","+s.getSid()+",'"+s.getDatetime()+"')";
//		return objJDBC.update(query);
//	}


	public List<Result> getAllResult() 
	{
		 return objJDBC.query("select * from result",new RowMapper<Result>()
		 {
			  public Result mapRow(ResultSet rs, int row) throws SQLException
			  {
				  Result obj = new Result();
				  obj.setSid(rs.getInt("sid"));
				  obj.setRid(rs.getInt("rid"));
				  obj.setMaths(rs.getInt("Maths"));
				  obj.setHindi(rs.getInt("hindi"));
				  obj.setEnglish(rs.getInt("English"));
				  obj.setScience(rs.getInt("science"));
				  obj.setSanskrit(rs.getInt("sanskrit"));
				  return obj;
			  }
		 });
	}
	//---------------------//result->sid->student->classid->class
	//select result.sid,student.class_id,result.Maths,result.English ,result.hindi,result.science,result.sanskrit,class.section ,class.classname from result JOIN student on student.sid=result.sid join class on class.classid=student.class_id;
	//select result.sid,student.class_id,result.Maths,result.English ,result.hindi,result.science,result.sanskrit,class.section ,class.classname from result JOIN student on student.sid=result.sid join class on class.classid=student.class_id;

	public List<MergeClass> joinData() 
	{
		 return objJDBC.query("select result.sid,student.class_id,result.Maths,result.English ,result.hindi,result.science,result.sanskrit,class.section ,class.classname from result JOIN student on student.sid=result.sid join class on class.classid=student.class_id",new RowMapper<MergeClass>()
		 {
			  public MergeClass mapRow(ResultSet rs, int row) throws SQLException
			  {
				  MergeClass obj = new MergeClass();
				  obj.setSid(rs.getInt("sid"));
				  obj.setMaths(rs.getInt("Maths"));
				  obj.setHindi(rs.getInt("hindi"));
				  obj.setEnglish(rs.getInt("English"));
				  obj.setScience(rs.getInt("science"));
				  obj.setSanskrit(rs.getInt("sanskrit"));
				  obj.setClassname(rs.getString("classname"));
				  obj.setClass_id(rs.getInt("class_id"));
				  obj.setSection(rs.getString("section"));
				  return obj;
			  }
		 });
	}
//----------------------ps----------------------------------------------------
	public List<Result> Question1_7()
	{
        String squery = "select classname, section, avg(maths) ,avg(hindi),avg(english),avg(science),avg(sanskrit) from result inner join class inner join student on student.sid=result.sid and student.class_id=class.classid group by class.classid";

        return objJDBC.query(squery, new ResultSetExtractor<List<Result>>() {

            public List<Result> extractData(ResultSet rs) throws SQLException, DataAccessException {

                List<Result> rlist = new ArrayList<Result>();

                while (rs.next()) {

                    Class1 st = new Class1();
                    st.setClassname(rs.getString("classname"));
                    st.setSectionname(rs.getString("section"));
                   
                    Student stud = new Student();
                    stud.setObjclass(st);
                    

                    Result r = new Result();
                    r.setObjstud(stud);
                    r.setHindi(rs.getInt("avg(hindi)"));
                    r.setEnglish(rs.getInt("avg(english)"));
                    r.setSanskrit(rs.getInt("avg(sanskrit)"));
                    r.setScience(rs.getInt("avg(science)"));
                    r.setMaths(rs.getInt("avg(Maths)"));                  

                    rlist.add(r);
                }
                return rlist;
            }
        });
    }

}
