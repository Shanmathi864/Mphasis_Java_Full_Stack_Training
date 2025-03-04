package Shanmathi_Program;

class P1
{
	public void draw() {
		System.out.println("Drawing");
	}
}
class C1 extends P1
{
	@Override
	public void draw()
	{
		System.out.println("Square");
	}
}
class C2 extends P1
{
	@Override
	public void draw()
	{
		System.out.println("Circle");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P1 obj1 = new P1();
		obj1.draw();
		P1 obj2 = new C2();
		obj2.draw();
		P1 obj3 = new C1();
		obj3.draw();
	}

}
