package com.yash.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTransactionManager;


import com.yash.model.Irm;

public class IrmDao 
{
	@Autowired
    private HibernateTransactionManager hbmObjIrm;
   
    public void setHbmObjIrm(HibernateTransactionManager hbmObjIrm) {
		this.hbmObjIrm = hbmObjIrm;
	}

	//getallIrm
    public List<Irm> getAllirm()
    {
    	SessionFactory sf = hbmObjIrm.getSessionFactory();
        Session session = sf.openSession();
        List<Irm> irm = new ArrayList<Irm>();
        Criteria criteria = session.createCriteria(Irm.class);
        irm = criteria.list();
        return irm;
    }
}
