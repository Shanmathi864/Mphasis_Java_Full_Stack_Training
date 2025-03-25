package com.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.User;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;



@Tag(name = "HelloWorldController", description = "The RestAPI")
@RestController
public class HelloWorldActuator {
	
	User obj = new User();
	
	@Value("${name.fname}") 
	String fname;
	
	@Value("${email.email}")
	String email;
	
	@Value("${desg.role}")
	String desgrole;
	
	@Operation(summary = "post method", description="getting data from client")	
	@GetMapping("/hello")
	public String sayHello()
	{
		obj.setFname(fname);
		obj.setEmail(email);
		obj.setDesgrole(desgrole);
		return "Name: "+obj.getFname()+" Email: "+obj.getEmail()+" desgrole: "+obj.getDesgrole();
	}
}
