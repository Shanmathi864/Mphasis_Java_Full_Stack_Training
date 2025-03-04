package Shanmathi_Program;

public class FactoryDemo {
public static void main(String[] args) {
		
		Employee obj = Employee.getInstance();
		
		System.out.println(obj.hashCode());
		System.out.println();
	}


}
