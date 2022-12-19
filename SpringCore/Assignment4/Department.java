package ass4;

import java.util.List;

public class Department 
{
	int id;
	String deptname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	@Override
	public String toString()
	{
		return "Department[Id="+id+"Name "+deptname+"]";
	}
}
