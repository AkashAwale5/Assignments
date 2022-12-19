package com.yash.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTransactionManager;


import com.yash.model.Project;

public class ProjectDao
{
	private HibernateTransactionManager proobj;

	public void setProobj(HibernateTransactionManager proobj)
	{
		this.proobj = proobj;
	}
	
	//getAllproject
	public List<Project> getAllProject()
	{
		SessionFactory sf=proobj.getSessionFactory();
		Session session=sf.openSession();
		List<Project> project= new ArrayList<Project>();
		Criteria criteria=session.createCriteria(Project.class);
		 project = criteria.list();
		 return project;
		
	}
}
