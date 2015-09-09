package com.mindtree.employeesearch.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	private Integer empId;
	private String empName;
	private String verticle;
	private String companyName;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(Integer empId, String empName, String verticle, String companyName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.verticle = verticle;
		this.companyName = companyName;
	}


	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getVerticle() {
		return verticle;
	}


	public void setVerticle(String verticle) {
		this.verticle = verticle;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", verticle=" + verticle + ", companyName="
				+ companyName + "]";
	}
	
	
	
	
}
