package com.test.entity;

import java.util.Arrays;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "user5")

//@NamedNativeQuery(name = "user5.firstName", query = "select u from user5 u where u.firstName = /1", nativeQuery=true)

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotEmpty(message = "First name required")
	@Size(min = 3, max = 25)
	private String firstname;
	
	@NotEmpty(message = "Last name required")
	@Size(min = 3, max = 25)
	private String lastname;
	
	@NotEmpty(message = "fill the field*")
	private String gender;
	
	private String[] Food;
	
	@NotEmpty(message = "From city is required")
	private String cityFrom;
	
	@NotEmpty(message = "To city is required")
	private String cityTo;
	
	@DateTimeFormat(pattern = "dd-mm-yyyy")
	@NotEmpty
	private String jDate;
	
	@NotEmpty
	private String[] seat;
	
	public User()
	{
		
	}

	
	public User(String firstName,  String lastName,  String gender, String[] food,
			 String cityFrom,  String cityTo,  String[] seat, String jDate) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		Food = food;
		this.cityFrom = cityFrom;
		this.cityTo = cityTo;
		this.jDate = jDate;
		this.seat = seat;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender
				+ ", Food=" + Arrays.toString(Food) + ", cityFrom=" + cityFrom + ", cityTo=" + cityTo + ", jDate="
				+ jDate + ", seat=" + Arrays.toString(seat) + "]";
	}

	public boolean validate(String u1, String p1)
	{
		if(u1.equals(cityTo))
			return true;
		else
			return false;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getFood() {
		return Food;
	}

	public void setFood(String[] food) {
		Food = food;
	}

	public String getCityFrom() {
		return cityFrom;
	}

	public void setCityFrom(String cityFrom) {
		this.cityFrom = cityFrom;
	}

	public String getCityTo() {
		return cityTo;
	}

	public void setCityTo(String cityTo) {
		this.cityTo = cityTo;
	}

	public @NotEmpty String getjDate() {
		return jDate;
	}

	public void setjDate(@NotEmpty String jDate) {
		this.jDate = jDate;
	}

	public String[] getSeat() {
		return seat;
	}

	public void setSeat(String[] seat) {
		this.seat = seat;
	}	
	
}
