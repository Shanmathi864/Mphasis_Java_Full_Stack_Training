package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.Entity.HospitalEntity;
import com.test.dao.HospitalDao;

@Service
public class HospitalServiceImpl implements HospitalService{

	@Autowired
	private HospitalDao hospitaldao;
	@Override
	public HospitalEntity createDetails(HospitalEntity hspt) 
	{
		return hospitaldao.createDetails(hspt);
	}

	@Override
	public HospitalEntity updateDetails(HospitalEntity hspt) 
	{
		return hospitaldao.createDetails(hspt);
	}

	@Override
	public List<HospitalEntity> readDetails() 
	{
		return hospitaldao.readDetails();
	}

	@Override
	public String deleteDetails(int ID) 
	{
		hospitaldao.deleteDetails(ID);
		return "Patients Details Deleted Successfully";
	}

}
