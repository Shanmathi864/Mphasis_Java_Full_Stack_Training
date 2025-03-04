package Shanmathi_Program;

interface Inf1
{
	void fox();
	void tiger();
}

interface Inf2
{
	void book();
}
abstract class Abs
{
	public void dog()
	{
		System.out.println("abs implemented");
	}
	public abstract void cat();
	
}

class Impl extends Abs 
{
	public void cat()
	{
		System.out.println("abs method overrided");
	}
	public void fox()
	{
		System.out.println("inf fox() overrided");
	}
	public void tiger()
	{
		System.out.println("inf tiger() overrided");
	}
	public void book()
	{
		System.out.println("inf book() overrided");
	}
}

public class Multiple_using_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Impl obj =new Impl();
		
		obj.cat();
		obj.dog();
		obj.fox();
		obj.tiger();
		obj.book();
	}

}
