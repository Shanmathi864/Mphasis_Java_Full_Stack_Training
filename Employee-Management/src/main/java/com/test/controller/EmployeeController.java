package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Employee;
import com.test.service.EmployeeService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService empservice;
	
	@PostMapping("save-emp")
	public boolean saveEmployee(@RequestBody Employee emp) {
		 return empservice.saveEmployee(emp);
		
	}
	
	@GetMapping("emps-list")
	public List<Employee> allemps() {
		 return empservice.getEmployees();
	}
	
	
	@DeleteMapping("delete-emp/{id}")
	public boolean deleteStudent(@PathVariable("id") int id,Employee emp) {
		emp.setId(id);
		return empservice.deleteEmployee(emp);
	}

	@GetMapping("emp/{id}")
	public List<Employee> allstudentByID(@PathVariable("id") int id,Employee emp) {
		emp.setId(id);
		 return empservice.getEmployeeByID(emp);
		
	}
	
	@PostMapping("update-emp/{id}")
	public boolean updateStudent(@RequestBody Employee emp,@PathVariable("student_id") int student_id, int id) {
		emp.setId(id);
		return empservice.updateEmployee(emp);
	}
}
