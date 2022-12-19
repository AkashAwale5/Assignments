package com.yash.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

import com.yash.model.Department;

public class DepartmentDao 
{
	private HibernateTransactionManager deptobj;

	public void setDeptobj(HibernateTransactionManager deptobj) 
	{
		this.deptobj = deptobj;
	}
	
	//getAllDept
	public List<Department> getAllDept()
	{
		SessionFactory sessionFactory = deptobj.getSessionFactory();
		Session os = sessionFactory.openSession();
		List<Department> dept= new ArrayList<>();
		Criteria cr=os.createCriteria(Department.class);
		return dept = cr.list();
		
	}
}
