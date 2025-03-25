package com.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservation")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String custName;
	
	private double custContact;
	
	private String custAdd;
	
	private int seatCount;
	
	private String custBooking;
	
	private String custseat;
	
	private String custOcca;
	
	private String custFood;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public double getCustContact() {
		return custContact;
	}

	public void setCustContact(double custContact) {
		this.custContact = custContact;
	}

	public String getCustAdd() {
		return custAdd;
	}

	public void setCustAdd(String custAdd) {
		this.custAdd = custAdd;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public String getCustBooking() {
		return custBooking;
	}

	public void setCustBooking(String custBooking) {
		this.custBooking = custBooking;
	}

	public String getCustseat() {
		return custseat;
	}

	public void setCustseat(String custseat) {
		this.custseat = custseat;
	}

	public String getCustOcca() {
		return custOcca;
	}

	public void setCustOcca(String custOcca) {
		this.custOcca = custOcca;
	}

	public String getCustFood() {
		return custFood;
	}

	public void setCustFood(String custFood) {
		this.custFood = custFood;
	}

	
	

	
}
