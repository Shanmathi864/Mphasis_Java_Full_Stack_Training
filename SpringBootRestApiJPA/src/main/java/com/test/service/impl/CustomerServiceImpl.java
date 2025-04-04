package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.CustomerDao;
import com.test.entity.Customer;
import com.test.service.CustomerService;
@Service
public abstract class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerDao customerDao;
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public Customer createCustomer(Customer cst) {
		try {
			if(cst != null) {
				customerDao.createCustomer(cst);
			}
		}catch (RuntimeException e) {
			  e.printStackTrace();
		}
		return cst;
	}

	public List<Customer> updateCustomers(Customer cst) {
		 try {
			 
			 if(cst != null) {
				 customerDao.updateCustomer(cst);
			 }
			 
		 }catch (RuntimeException e) {
			 e.printStackTrace();
		}
		return customerDao.readAllCustomers();
	}

	public List<Customer> readAllCustomers(Customer c ) {
		List<Customer> list = customerDao.readAllCustomers();
		if(list.size() <=0) {
			System.out.println("NO CONTENT");
		}
		return list;
	}

	@Override
	public List<Customer> deleteCustomers(int id) {
 try {
			 
			 if(id != 0) {
				 customerDao.deleteCustomer(id);
			 }
			 
		 }catch (RuntimeException e) {
			 e.printStackTrace();
		} 
		return customerDao.readAllCustomers();
	}

}
