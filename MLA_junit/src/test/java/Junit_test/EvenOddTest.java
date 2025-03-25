package Junit_test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit_maven.Calculator;
import junit_maven.EvenOdd;

public class EvenOddTest {
 
	EvenOdd obj;
	
	static int x;
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Before the test");
		x=12;
	}
	@AfterClass
	public static void afterClass()
	{
		System.out.println("After the test");
		x=10;
	}
	@Before
	public void setUp()
	{
		System.out.println("executes every test method before Execution");
		
		obj = new EvenOdd();
	}
    @After
	public void setDown()
	{
		System.out.println("executes every test method after Execution");
	
		obj = null;
		
	}
    @Test
    public void testEven()
    {
    	System.out.println("Even Number");
    	
    	int result = obj.even(x);
    	
    	assertEquals(0, result);
    }
    
}
