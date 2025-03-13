package com.test;

import java.util.Objects;

public class User {

	private String fullName;
	
	private String userName;
	
	private String password;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(String fullName, String userName, String password) {
		super();
		this.fullName = fullName;
		this.userName = userName;
		this.password = password;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [fullName=" + fullName + ", userName=" + userName + ", password=" + password + ", getFullName()="
				+ getFullName() + ", getUserName()=" + getUserName() + ", getPassword()=" + getPassword()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(fullName, password, userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(fullName, other.fullName) && Objects.equals(password, other.password)
				&& Objects.equals(userName, other.userName);
	}
	
	
}
