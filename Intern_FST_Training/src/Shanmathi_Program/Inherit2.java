package Shanmathi_Program;

class C
{	
	public void method1() {
		System.out.println("Name :");
	}
}
class D extends C
{	
	public void method2()
	{
		System.out.println("Department: ");
	}
}
class E extends D
{
	public void method3()
	{
		System.out.println("Age: ");
	}
}
public class Inherit2 {

	public static void main(String[] args) {
		E obj=new E();
		obj.method3();
		obj.method2();
		obj.method1();
	
		C obj1=new C();
		D obj3=obj;
	}
}
