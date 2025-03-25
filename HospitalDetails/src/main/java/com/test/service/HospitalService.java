package com.test.service;

import java.util.List;

import com.test.Entity.HospitalEntity;

public interface HospitalService {

public HospitalEntity createDetails(HospitalEntity hspt);
	
	public HospitalEntity updateDetails(HospitalEntity hspt);
	
	public List<HospitalEntity> readDetails();
	
	public String deleteDetails(int ID);
	
}
