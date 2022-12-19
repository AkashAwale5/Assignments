package com.yash.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

import com.yash.model.Employee;
import com.yash.model.Irm;
import com.yash.model.Project;

public class EmployeeDao
{
	private HibernateTransactionManager hbmObj;

	public void setHbmObj(HibernateTransactionManager hbmObj)
	{
		this.hbmObj = hbmObj;
	}
	
	public void saveEmployee(Employee e)
	  {
	    SessionFactory sf =hbmObj.getSessionFactory();
	    Session objSession = sf.openSession();
	    Transaction t= objSession.beginTransaction();
		  objSession.save(e);
		  t.commit();
		  System.out.println("data is saved");
		  objSession.close();
	  }

    //----------------------------------------------------------------------------------------
    public void getProjectNameWithEmployee() { 
        System.out.println("------ 1 & 2 Find out number of employee working on different project.-----------");
       SessionFactory sf = hbmObj.getSessionFactory();
        Session objSession = sf.openSession();
        Transaction t = objSession.beginTransaction();


        String HQL ="SELECT pro.projectid, pro.projectname,count(emp) FROM Project pro  LEFT JOIN  pro.emplyoee emp GROUP BY pro";

       Query query= objSession.createQuery(HQL, Object[].class);
       List<Object[]> list=query.list();
       for(Object[] objects : list) {
           Integer pid = (Integer) objects[0];

           String projectname=(String)objects[1];
           Long countemp=(Long)objects[2];
           System.out.println("Project id :"+pid);
           System.out.println("Project_Name:"+projectname);
           System.out.println("Total No Of Emplyee:"+countemp);
       }
    }
    //------------------------------------------
    public List<Irm> getdAllIrm() {
        System.out.println("3-----Print only IRM details--------");
        SessionFactory sf = hbmObj.getSessionFactory();
        Session objSession = sf.openSession();
        Transaction t = objSession.beginTransaction();
        List<Irm> ilist = new ArrayList<Irm>();
        Criteria ctr = objSession.createCriteria(Irm.class);
        ilist = ctr.list();
        return ilist;
    }
//----------------------------------------------------------------------
    public void MaxSalaryWithbaselocation() 
    { 
        SessionFactory sf = hbmObj.getSessionFactory();
        Session objSession = sf.openSession();
        Transaction t = objSession.beginTransaction();

        System.out.println("-------- 4 Print maximum salary of each base location------");

        String HQL ="SELECT blc.blocname,blc.blocid,Max(emp.salary) FROM BaseLocation blc "
                + "LEFT JOIN  blc.emplyoee emp GROUP BY blc";
        Query query= objSession.createQuery(HQL, Object[].class);
        List<Object[]> list=query.list();
        for(Object[] objects : list) {
            String blocname=(String)objects[0];
            Integer blocid =(Integer)objects[1];
            Double  maxsalary =(Double) objects[2];
            System.out.println("BaseLoaction:"+blocname);
            System.out.println("Baselocatio id:"+blocid);
            System.out.println("maximum salary by dept:"+maxsalary);
        }
   }
    //-------------------------------------------------------------
    public void MaxSalarywithProject() { //done
        SessionFactory sf = hbmObj.getSessionFactory();
        Session objSession = sf.openSession();
        Transaction t = objSession.beginTransaction();

        System.out.println("------ 5 Print maximum salary of each Project------");

        String HQL ="SELECT pro.projectname,Max(emp.salary) FROM Project pro LEFT JOIN  pro.emplyoee emp GROUP BY pro";

        Query query= objSession.createQuery(HQL, Object[].class);
        List<Object[]> list=query.list();
        for(Object[] objects : list) {
            String projectname=(String)objects[0];
            Double  maxsalary =(Double)objects[1];
            System.out.println("project_name:"+projectname);
            System.out.println("maximum salary by project:"+maxsalary);
        }
    }
    //---------------------------------------------------------------
    public void MinSalarywithbaselocation() {
        SessionFactory sf = hbmObj.getSessionFactory();
        Session objSession = sf.openSession();
        Transaction t = objSession.beginTransaction();

        System.out.println("----------6 Print minimum salary of each base location--------------");

    //    String HQL ="SELECT bloc.blocname,Min(emp.salary) FROM BaseLocation bloc LEFT JOIN  bloc.employee emp GROUP BY bloc";

        String HQL ="SELECT blc.blocname,blc.blocid,min(emp.salary) FROM BaseLocation blc "
                 + "LEFT JOIN  blc.emplyoee emp GROUP BY blc";
        Query query= objSession.createQuery(HQL, Object[].class);
        List<Object[]> list=query.list();
        for(Object[] objects : list) {
            String blocname=(String)objects[0];
            Integer blocid =(Integer)objects[1];
            Double  minsalary =(Double)objects[2];
            System.out.println("BaseLoaction:"+blocname);
            System.out.println("minimum salary by dept:"+minsalary);
        }

    }
    //---------------------------------------------------
    public void MinSalarywithProject() { //done
        SessionFactory sf = hbmObj.getSessionFactory();
        Session objSession = sf.openSession();
        Transaction t = objSession.beginTransaction();

        System.out.println("-------------- 7 Print minimum salary of each Project-------------");

        String HQL ="SELECT pro.projectname,Min(emp.salary) FROM Project pro LEFT JOIN  pro.emplyoee emp GROUP BY pro";

        Query query= objSession.createQuery(HQL, Object[].class);
        List<Object[]> list=query.list();
        for(Object[] objects : list) {
            String projectname=(String)objects[0];
            Double  minsalary =(Double)objects[1];
            System.out.println("project_name:"+projectname);
            System.out.println("minimum salary by project:"+minsalary);
        }
    }
    //----------------------------------------------------
    public void getDepartmentWithAvgSalary() { // done
        SessionFactory sf = hbmObj.getSessionFactory();
        Session objSession = sf.openSession();
        Transaction t = objSession.beginTransaction();

        System.out.println("----------- 9 Print Average salary of each Department-------------");

        String HQL ="SELECT dept.deptid,dept.dname,Avg(emp.salary) FROM Department dept  JOIN  dept.emplyoee emp GROUP BY dept";

        Query query= objSession.createQuery(HQL, Object[].class);
        List<Object[]> list= query.list();
        for(Object[] objects : list) {
            Integer deptid=(Integer)objects[0];
            String deptname=(String)objects[1];
            Double  avgsalary=(Double)objects[2];
            System.out.print("Department_Id :  "+deptid);
            System.out.print("  Department_Name : "+deptname);
            System.out.println("  Average of  salary by Department:"+avgsalary);
        }
    }
    //-------------------------------11--------------------
    public List<Project> getProjrctDetailWithEmployee(){

        SessionFactory sf = hbmObj.getSessionFactory();
        Session objSession = sf.openSession();
        Transaction t = objSession.beginTransaction();
        List<Project> plist = new ArrayList<Project>();
        Criteria ctr = objSession.createCriteria(Project.class);
        plist = ctr.list();
        return plist;

    }
    //-------------------------------12-----------------------------
    public List<Employee> getEmployeeAndIrmName()
    {
        SessionFactory sf = hbmObj.getSessionFactory();
        Session objSession = sf.openSession();
        Transaction t = objSession.beginTransaction();
        List<Employee> clist = new ArrayList<Employee>();
        Criteria ctr = objSession.createCriteria(Employee.class);
        clist = ctr.list();
        return clist;
    }
    //select count(*),department.dname from employee join department on employee.dept_id=department.dept_id group by employee.dept_id;
    public void getEmpDept()
    {
    	SessionFactory sf = hbmObj.getSessionFactory();
        Session objSession = sf.openSession();
        Transaction t = objSession.beginTransaction();

        System.out.println("----------- 8  Print total number of employees in each department. -------------");
        String HQL="select dept.dname,count(empid) from Department dept left join dept.emplyoee emp group by dept";
        Query<Object[]> query= objSession.createQuery(HQL, Object[].class);
        List<Object[]> list = query.list();
        for(Object[] objects : list) 
        {
        	 String dname=(String)objects[0];      
            Long count=(Long)objects[1];
              
            System.out.print("Employee Count :  "+count);
            System.out.println("  Department_Name : "+dname);
         
        }
    }
    //------------------10---------------------------
    public void getEmpIrm()
    {
    	SessionFactory sf = hbmObj.getSessionFactory();
        Session objSession = sf.openSession();
        Transaction t = objSession.beginTransaction();

        System.out.println("----------- 10   Print total number of employee working under each project manager.-------------");
        String HQL="select dept.dname,count(empid) from Department dept left join dept.emplyoee emp group by dept";
        Query<Object[]> query= objSession.createQuery(HQL, Object[].class);
        List<Object[]> list = query.list();
        for(Object[] objects : list) 
        {
        	 String dname=(String)objects[0];      
            Long count=(Long)objects[1];
              
            System.out.print("Employee Count :  "+count);
            System.out.println("  Department_Name : "+dname);
         
        }
    }
    //---------------------------------yash-------------------
    //getting all employees
    public List<Employee> getAllEmployees()
    {
        SessionFactory sf = hbmObj.getSessionFactory();        
        Session session = sf.openSession();
        List<Employee> employees = new ArrayList<Employee>();
        Criteria criteria = session.createCriteria(Employee.class);
        employees = criteria.list();
        return employees;
    }
}
