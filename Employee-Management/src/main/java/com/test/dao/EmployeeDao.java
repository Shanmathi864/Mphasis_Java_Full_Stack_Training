package com.test.dao;

import java.util.List;

import com.test.model.Employee;

public interface EmployeeDao {

	public boolean saveEmployee(Employee emp);
	public List<Employee> getEmployees();
	public boolean deleteEmployee(Employee emp);
	public List<Employee> getEmployeeByID(Employee emp);
	public boolean updateEmployee(Employee emp);
}
