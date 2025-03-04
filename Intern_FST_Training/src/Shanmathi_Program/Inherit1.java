package Shanmathi_Program;

class A
{
	int id=100;
	String name ="Rohit";
	
	public void userDetails()
	{
		System.out.println("ID : "+id+" Name : "+name);
	}
}
class B extends A
{
	String city ="Chennai";
	
	public void stdInfo()
	{
		System.out.println("ID : "+id+" Name : "+name+" City : "+city);
	}
}
public class Inherit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj =new B();
		obj.stdInfo();
	}

}
