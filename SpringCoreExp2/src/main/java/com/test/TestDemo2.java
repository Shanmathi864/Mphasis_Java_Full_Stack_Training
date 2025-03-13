package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo2 {

public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans1.xml");
		
		Employee obj = ctx.getBean("Emp1", Employee.class);
		
		System.out.println(obj);
	}
}
