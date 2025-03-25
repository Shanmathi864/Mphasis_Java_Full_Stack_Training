package Com.main;

import java.util.Objects;



public class Task1 {

	private int id;
	
	private String fName;
	
	private String lName;
	
	private int age;
	
	private String city;
	
	private int pincode;

	public Task1(int id, String fName, String lName, int age, String city, int pincode) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.city = city;
		this.pincode = pincode;
	}

	public Task1() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Task1 [id=" + id + ", fName=" + fName + ", lName=" + lName + ", age=" + age + ", city=" + city
				+ ", pincode=" + pincode + ", getId()=" + getId() + ", getfName()=" + getfName() + ", getlName()="
				+ getlName() + ", getAge()=" + getAge() + ", getCity()=" + getCity() + ", getPincode()=" + getPincode()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, city, fName, id, lName, pincode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task1 other = (Task1) obj;
		return age == other.age && Objects.equals(city, other.city) && Objects.equals(fName, other.fName)
				&& id == other.id && Objects.equals(lName, other.lName) && pincode == other.pincode;
	}
	
	public void setName(String name) {
		this.fName = fName;
		
		if(name == null)
		{
			throw new IllegalArgumentException("Username can't be blank");
			
		}
		else
		{
			if(fName.length() < 3)
			{
				throw new IllegalArgumentException("Firstname is too short");
			}
			else if(fName.length() > 30)
			{
				throw new IllegalArgumentException("name is too long");
			}
		}
		this.fName =fName;
	}
	
	
}
