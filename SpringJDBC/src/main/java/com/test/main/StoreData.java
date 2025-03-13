package com.test.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dao.CustDao;
import com.test.model.Customer;

//import java.util.Scanner;

public class StoreData {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Cust name:");
		
		String str1 =sc.nextLine();
		
        System.out.println("Enter the Cust Type:");
		
		String str2 =sc.nextLine();*/
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Customer obj = new Customer();
		
		obj.setName("Raghul");
		
		obj.setType("Partial");
		
		CustDao cst = ctx.getBean("custDao", CustDao.class);
		
		//cst.createCustomer(obj);
		
		//System.out.println("Done");
		
		//Customer obj1 = new Customer();
		
		//obj1.setId(1);
		
		//cst.deleteCustomer(obj1);
		
		/*Customer obj2 = new Customer();
		
		obj2.setName(str1);
		
		obj2.setType(str2);
		
		cst.updateCustomer(obj2);*/
		
		List<Customer> data = cst.getAllCustomers();
		
		for(Customer cstd : data)
		{
			System.out.println(cstd);
		}

	}

}
