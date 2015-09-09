package com.mindtree.employeesearch.employeedaoImpl;

import java.sql.BatchUpdateException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;













import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.employeesearch.employeedao.EmployeeDao;
import com.mindtree.employeesearch.entity.Employee;
import com.mindtree.employeesearch.exception.DaoException;

@Transactional(propagation=Propagation.MANDATORY) 
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	private HibernateTemplate template;
	
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	
	
/*	@Transactional
	public List<Employee> getEmployeesDetails(String employeeName) {
		Session session=getSession();
		List<Employee> employeeList=new ArrayList<Employee>();
		String hql="from Employee where empName=:name";
		Query query=session.createQuery(hql);
		query.setString("name",employeeName);
		//employeeList=query.list();
		employeeList= template.find("from Employee");
		
		String sar1i="sam";
		return employeeList;
	}*/
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Employee> getEmployeesDetails(String employeeName) throws DaoException{
		return template.find("from Employee where empName=?",employeeName);
	}

	@Transactional
	public void saveEmployee(Employee emp) throws DaoException{
	
			template.saveOrUpdate(emp);
		
		
		
	}
	
/*	public Session getSession(){
		ApplicationContext context = 
	            new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SessionFactory sessionFactory=(SessionFactory) context.getBean("sessionFactory");
		HibernateTemplate hibernateTemplate=new HibernateTemplate(sessionFactory);
		Session session = sessionFactory.openSession();
		return session;
	}*/




}
