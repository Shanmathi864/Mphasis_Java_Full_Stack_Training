package Junit_test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import junit_maven.Calculator;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class CalculatorTest {

Calculator obj;
	
	static int x;
	static int y;
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Before all the test Cases only one time");
		 x = 10;
		 y = 50;
	}
	@AfterClass
	public static void afterClass()
	{
		System.out.println("After all the test Cases only one time");
		x = 0;
		y = 0;
	}
	@Before
	public void setUp()
	{
		System.out.println("executes every test method before Execution");
		
		obj = new Calculator();
	}
    @After
	public void setDown()
	{
		System.out.println("executes every test method after Execution");
	
		obj = null;
		
	}
    @Test
    public void testAdd()
    {
    	System.out.println("testAdd method");
    	
    	int result = obj.add(x, y);
    	
    	assertEquals(60, result);
    }
    
    @Test
    public void testSub()
    {
    	System.out.println("tsetSub method");
    	
        int result = obj.sub(x, y);
    	
    	assertEquals(-40, result);
    }
    @Test
    public void testMul()
    {
    	System.out.println("TestMul method");
    	
        int result = obj.mul(x, y);
    	
    	assertEquals(500, result);
    }
    @Test
    public void testgreetUser()
    {
    	System.out.println("TestgreetUser method");
    	
    	assertEquals("hi hello", obj.greetUser("hi hello"));
    }
}
