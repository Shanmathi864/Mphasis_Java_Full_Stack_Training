package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StdAnnotationTest {
 
	public static void main(String[] args) {
	
		ApplicationContext ctx = new AnnotationConfigApplicationContext(StdConfig.class);
		
		Student obj = ctx.getBean("getStd1", Student.class);
		
		obj.setId(121);
		
		obj.setName("John");
		
		List<String> skills = Arrays.asList("Python", "JavaScript", "Angular");
		
		obj.setSkills(skills);
		
		System.out.println(obj);
}
}
