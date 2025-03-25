package com.test.dao;

import java.util.List;

import com.test.Entity.HospitalEntity;

public interface HospitalDao {

	public HospitalEntity createDetails(HospitalEntity hspt);
	
	public HospitalEntity updateDetails(HospitalEntity hspt);
	
	public List<HospitalEntity> readDetails();
	
	public String deleteDetails(int ID);
}
