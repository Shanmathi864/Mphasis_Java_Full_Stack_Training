package com.test;

import java.util.List;

public class Employee {

	private int id;
	
	private String name;
	
	private List<String> posting;
	
	public Employee()
	{
		
	}

	public Employee(int id, String name, List<String> posting) {
		super();
		this.id = id;
		this.name = name;
		this.posting = posting;
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

	public List<String> getPosting() {
		return posting;
	}

	public void setPosting(List<String> posting) {
		this.posting = posting;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", posting=" + posting + "]";
	}
	
}
