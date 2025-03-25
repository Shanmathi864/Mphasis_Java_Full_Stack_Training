package com.test.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.Entity.HospitalEntity;
import com.test.repository.HospitalRepository;

@Repository
public class HospitalDaoImpl implements HospitalDao{

	@Autowired
	private HospitalRepository hospitalRepo;
	@Override
	public HospitalEntity createDetails(HospitalEntity hspt) 
	{	
		return hospitalRepo.save(hspt);
	}

	@Override
	public HospitalEntity updateDetails(HospitalEntity hspt) 
	{
		return hospitalRepo.save(hspt);
	}

	@Override
	public List<HospitalEntity> readDetails() 
	{
		return hospitalRepo.findAll();
	}

	@Override
	public String deleteDetails(int ID) 
	{
		hospitalRepo.deleteById(ID);
		return "Patients details deleted.";
	}

}
