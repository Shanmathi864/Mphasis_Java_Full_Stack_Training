package Shanmathi_Program;

interface FunInf
{
	void greetUser();
	
	static void human()
	{
		System.out.println("static");
	}
	
	default void animal()
	{
		System.out.println("default");
	}
	
	private void fox()
	{
		System.out.println("private method");
	}
}

public class Function_Inf {
	
	public static void main(String[] args) {
		
		FunInf obj1 = new FunInf()
				{
			         public void greetUser()
			         {
			        	 System.out.println("funinf method overrided");
			         }
				};
				
				obj1.greetUser();
				
			new FunInf() {
				
				@Override
				public   void greetUser()
				{
					System.out.println("nameless object");
				}
			}.greetUser();
			
			//java 8 Feature
			
			//FunInf obj2 = ()->System.out.println("java 8 new Feature");
			
			//obj2.greetUser();
	}
	}


