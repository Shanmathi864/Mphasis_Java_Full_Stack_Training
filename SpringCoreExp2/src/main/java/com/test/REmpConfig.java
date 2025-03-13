package com.test;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class REmpConfig {

	

	@Bean
	public static REmployee getRemp2()
	{
		return new REmployee(502, "Ana", Arrays.asList("developer","Analyst","Admin"));
	}
}
