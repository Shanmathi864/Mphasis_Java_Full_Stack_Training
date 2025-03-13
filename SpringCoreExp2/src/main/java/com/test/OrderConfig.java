package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfig {

	@Bean
	public static Order getO1()
	{
		return new Order(101, "Apple", 250);
	}
	
	
}
