package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo3 {

	public static void main(String[] args) {
		
		/*ApplicationContext ctx = new AnnotationConfigApplicationContext(REmpConfig.class);
		
        REmployee obj = (REmployee) ctx.getBean("getRemp2");
		
		System.out.println(obj);*/
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans2.xml");

		REmployee obj = ctx.getBean("Remp1", REmployee.class);
		
		//Student obj = ctx.getBean("std", Student.class);
		
		System.out.println(obj);
	}

}
