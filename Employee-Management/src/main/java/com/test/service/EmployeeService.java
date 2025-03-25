package com.test.service;

import java.util.List;

import com.test.model.Employee;

public interface EmployeeService {

public boolean saveEmployee(Employee emp);
	
	public List<Employee> getEmployees();
	
	public boolean deleteEmployee(Employee emp);
	
	public List<Employee> getEmployeeByID(Employee emp);
	
	public boolean updateEmployee(Employee emp);
}
