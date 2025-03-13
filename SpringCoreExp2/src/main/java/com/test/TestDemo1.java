package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo1 {
  
	public static void main(String[] args) {
	
	ApplicationContext ctx =new AnnotationConfigApplicationContext(OrderConfig.class); 
	
	Order obj = (Order) ctx.getBean("getO1");
	
	System.out.println(obj);
			
	}
}
