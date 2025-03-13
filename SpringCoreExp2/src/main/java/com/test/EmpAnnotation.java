package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpAnnotation {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(EmpConfig.class);
		
		Employee obj = ctx.getBean("getEmp2", Employee.class);
		
		obj.setId(101);
		
		obj.setName("Danny");
		
		List<String> posting = Arrays.asList("HR", "Manager", "Team Lead");
		
		obj.setPosting(posting);
		
		System.out.println(obj);

	}

}
