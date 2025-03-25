package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.EmployeeDao;
import com.test.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao empdao;
	
	public boolean saveEmployee(Employee emp) {
		return empdao.saveEmployee(emp);
	}

	public List<Employee> getEmployees() {
		return empdao.getEmployees();
	}

	public boolean deleteEmployee(Employee emp) {
		return empdao.deleteEmployee(emp);
	}

	public List<Employee> getEmployeeByID(Employee emp) {
		return empdao.getEmployeeByID(emp);
	}

	public boolean updateEmployee(Employee emp) {
		return empdao.updateEmployee(emp);
	}
	
	

}
