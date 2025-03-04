package Shanmathi_Program;

class MachineData
{
	static int id = 101;
	      
	       int pin = 10111;
	       
	       static class InnerClass1
	       {
	    	   void disp() {
	    		   
	    		   System.out.println("Static inner class" +id);
	    		   
	    	   }

			public void show() {
				// TODO Auto-generated method stub
				
			}
	       }
	       
	       class InnerClass2
	       {
	    	   void show()
	    	   {
	    		   System.out.println("non-static inner class"+pin);
	    	   }
	       }
}

public class StaticDemo {

	public static void main(String[] args) {
		
		MachineData.InnerClass1 obj1 =new MachineData.InnerClass1();
		
		obj1.disp();
		
		//MachineData.InnerClass2 obj2 = new MachineData.InnerClass2();
		
		obj1.show();

	}

}
