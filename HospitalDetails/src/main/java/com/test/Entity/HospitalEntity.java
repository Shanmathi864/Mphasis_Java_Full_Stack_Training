package com.test.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HospitalDetails")
public class HospitalEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private int age;
	
	private String disease;

	public HospitalEntity()
	{
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public HospitalEntity(int id, String name, int age, String disease) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.disease = disease;
	}

	@Override
	public String toString() {
		return "HospitalEntity [id=" + id + ", name=" + name + ", age=" + age + ", disease=" + disease + "]";
	}
	
	
}
