package Junit_test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.rules.ExpectedException;

import junit_maven.User;

public class TestUserData {

	@Test
	public void testUserNameIsNull() {
		assertThrows(IllegalArgumentException.class,new Executable() {
			@Override
			public void execute() throws Throwable{
				User data=new User();
				data.setName(null);
				
			}
		});
	}
	@Test
	public void testNameIsNull() {
		Throwable exception=assertThrows(IllegalArgumentException.class,
				()->{
					User obj=new User();
					obj.setName("so");
				});
		assertEquals("username can't be blank",exception.getMessage());
	}
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test(expected = IllegalArgumentException.class)
	public void testNameValues()
	{
		User obj=new User();
		
		obj.setName(null);
	}
}
