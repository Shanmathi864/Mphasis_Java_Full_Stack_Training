package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.Entity.HospitalEntity;
import com.test.service.HospitalService;

@RestController
@RequestMapping("/hospital")
@CrossOrigin("http://localhost:4200/")
public class HospitalController {

	@Autowired
	private HospitalService hospitalservice;
	@PostMapping("/create")
	public List<HospitalEntity> createDetails(@RequestBody HospitalEntity entity)
	{
		hospitalservice.createDetails(entity);
		return hospitalservice.readDetails();
	}
	
	@PutMapping("/update/{ID}")
	public List<HospitalEntity> updateDetails(@PathVariable ("ID") int id, @RequestBody HospitalEntity entity) 
	{
		entity.setId(id);
	    hospitalservice.updateDetails(entity);
		return hospitalservice.readDetails();
	}
	
	@GetMapping("/readall")
	public List<HospitalEntity> readDetails()
	{
		return hospitalservice.readDetails();
	}
	
	@DeleteMapping("/delete/{ID}")
	public List<HospitalEntity> deleteDetails(@PathVariable ("ID") int id)
	{
		hospitalservice.deleteDetails(id);
		return hospitalservice.readDetails();
	}
}
