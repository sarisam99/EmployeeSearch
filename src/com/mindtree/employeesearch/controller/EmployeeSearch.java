package com.mindtree.employeesearch.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.employeesearch.employeedao.EmployeeDao;
import com.mindtree.employeesearch.employeedaoImpl.EmployeeDaoImpl;
import com.mindtree.employeesearch.entity.Employee;
import com.mindtree.employeesearch.exception.DaoException;

@Controller

public class EmployeeSearch {
	
	@Autowired
	private EmployeeDao employeeDao;

	@RequestMapping(value = "/")
	public String  getEmployeeSerachPage(){
		String sari="sari";
		System.out.println(sari);
		return "index";
	}
	
	@RequestMapping(value = "/searchEmployee")
	public ModelAndView  searchEmployeeByName(HttpServletRequest request) throws DaoException{
		
		String employeeName=request.getParameter("employeeName");
		List<Employee> employeeList=new ArrayList<Employee>();
		
		
		employeeList=employeeDao.getEmployeesDetails(employeeName);
		System.out.println(employeeList);
		ModelAndView modelAndView=new ModelAndView("index");
		modelAndView.addObject("employeeList",employeeList);
		return modelAndView;
	}
	
	@RequestMapping(value = "/addEmployee")
	public ModelAndView  addEmployee(HttpServletRequest request){
		ModelAndView modelAndView=new ModelAndView("addEmployee");
		return modelAndView;
	}
	
	
	@RequestMapping(value = "/saveEmployee")
	public ModelAndView  saveEmployee(HttpServletRequest request) throws DaoException{
		ModelAndView modelAndView=new ModelAndView("index");
		int empId=Integer.parseInt(request.getParameter("empId"));
		
		String empName=request.getParameter("empName");
		System.out.println("Emp"+empName);
		String verticle=request.getParameter("varticle");
		String compName=request.getParameter("compName");
	
		Employee e=new Employee();
		e.setEmpId(empId);
		e.setEmpName(empName);
		e.setVerticle(verticle);
		e.setCompanyName(compName);
		
		employeeDao.saveEmployee(e);
		modelAndView.addObject("success", "Employee added successfully!!");		
		return modelAndView;
	}
	
	
}
