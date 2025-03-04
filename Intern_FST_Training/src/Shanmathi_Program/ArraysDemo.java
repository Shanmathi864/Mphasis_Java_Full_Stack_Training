package Shanmathi_Program;

class Student
{
	private int id;
	
	private String name;
	
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		this.name=name;
		this.city =city;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString() {
		return "Student [id=" + id + ",name ="+ name +",city="+ "city]";
	}
	
}
public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj1 = new Student();
		
		obj1.setId(100);
		obj1.setName("Rohit");
		obj1.setCity("Mumbai");

		Student obj2=new Student();
		
		Student[] stdData = {obj1,obj2};
		
		for(int i=0;i<stdData.length;i++)
		{
			System.out.println(stdData[i]);
		}
	}

}
