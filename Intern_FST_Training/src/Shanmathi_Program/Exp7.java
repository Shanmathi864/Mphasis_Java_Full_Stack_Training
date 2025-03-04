package Shanmathi_Program;

class Employee
{
	public Employee() {
		System.out.println("Default constructor.");
	}
	public Employee(int x, String str) {
		System.out.println("parameterised constructor.");
	}
	public Employee(Employee obj)
	{
		System.out.println("Object parameterised constructor");
	}
	public static Employee getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
}
public class Exp7 {
	public static void main(String[] args) {
		Employee obj3 =new Employee();
		Employee obj1 =new Employee(0,"java");
		Employee obj2 =new Employee(obj1);
	}

}
