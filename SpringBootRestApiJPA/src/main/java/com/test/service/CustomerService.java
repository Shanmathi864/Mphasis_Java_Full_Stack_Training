package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.dao.CustomerDao;
import com.test.entity.Customer;


public interface CustomerService {

	@Autowired
	private CustomerDao dao;
	
	
	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}

	public Customer createCustomers(Product p) {
		
		
		
		return dao.createCustomers(p);
	}
	
	public List<Customer> readAll(){
		
		return dao.readAllProd();
	}
	
	public List<Customer> update(Customer p){
		dao.updateCustomers(p);
		
		return dao.readAllCustomers();
	}
	
	public List<Customer> deleteCustomers(int id){
		
		dao.deleteCustomers(id);
		return dao.readAllCustomers();
	}


}
