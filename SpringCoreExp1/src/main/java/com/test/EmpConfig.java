package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {

	@Bean
	public static Address getAdr1()
	{
		return new Address();
	}
	
	@Bean
	public static Address getAdr2()
	{
		return new Address("AP", "India", 543216);
	}
	
	
	@Bean
	public static Employee getEmp2()
	{
		return new Employee(111, "Kohli", "ICC", "Bangalore", new Address("KA", "India", 123456));
	}
	
	@Bean
	public static Employee getEmp1()
	{
		return new Employee();
	}
}
