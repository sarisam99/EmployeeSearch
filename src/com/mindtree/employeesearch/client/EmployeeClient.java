package com.mindtree.employeesearch.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.mindtree.employeesearch.entity.Employee;

public class EmployeeClient {
public static void main(String[] args) {
	
	ApplicationContext context = 
            new ClassPathXmlApplicationContext("applicationContext.xml");
	
	SessionFactory sessionFactory=(SessionFactory) context.getBean("sessionFactory");
	

	
	/*Session session = sessionFactory.openSession();
	Transaction tx = null;
	try {
		
	tx = session.beginTransaction();
	Employee e=new Employee();
	e.setEmpId(5);
	e.setEmpName("nanda");
	e.setVerticle("psg");
	e.setCompanyName("Mindree");
	session.save(e);
	 tx.commit();
}catch (Exception e) {
		e.printStackTrace();
		}finally {
	         session.close(); 
	      }*/
	
	
	HibernateTemplate hibernateTemplate=new HibernateTemplate(sessionFactory);
	Employee e=new Employee();
	e.setEmpId(6);
	e.setEmpName("nanda");
	e.setVerticle("psg");
	e.setCompanyName("Mindree");
	List<Employee> e2=new ArrayList<Employee>();
	e2=(List<Employee>) hibernateTemplate.find("from Employee");
	System.out.println("done!!!"+e2);
	

}
}
