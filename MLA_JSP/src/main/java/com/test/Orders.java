package com.test;

public class Orders {
private int id;
	
	private String name;
	
	private String descp;
	
	private int qnt;
	
	public Orders(int id, String name, String descp, int qnt) {
		super();
		this.id = id;
		this.name = name;
		this.descp = descp;
		this.qnt = qnt;
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



	public String getDescp() {
		return descp;
	}



	public void setDescp(String descp) {
		this.descp = descp;
	}



	public int getQnt() {
		return qnt;
	}



	public void setQnt(int qnt) {
		this.qnt = qnt;
	}



	@Override
	public String toString() {
		return "Orders [id=" + id + ", name=" + name + ", descp=" + descp + ", qnt=" + qnt + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
