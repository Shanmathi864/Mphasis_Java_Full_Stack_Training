package Shanmathi_Program;

interface Inf9
{
	void add();
	
	interface Inf10 {
		
		 void mul();

	}
}

class Impl7 implements Inf9.Inf10
{
	@Override
	public void mul() 
	{
		System.out.println("add()");
	}
	
}
public class NestedInfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Impl7 obj = new Impl7();
		
		obj.mul();
	}

}
