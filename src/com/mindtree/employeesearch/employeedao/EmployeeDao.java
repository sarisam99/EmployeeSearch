package com.mindtree.employeesearch.employeedao;

import java.util.List;

import com.mindtree.employeesearch.entity.Employee;
import com.mindtree.employeesearch.exception.DaoException;

public interface EmployeeDao {
	public List<Employee> getEmployeesDetails(String employeeName) throws DaoException;

	public void saveEmployee(Employee e) throws DaoException;

}
