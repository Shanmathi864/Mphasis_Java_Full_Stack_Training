package com.test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.rules.ExpectedException;

import Com.main.Task1;

public class Task1test {

	@Test
	public void testTaskObjects()
	{
		List<Task1> listActual = Arrays.asList(
				new Task1(101, "Allen", "Park", 25, "Chennai", 675343),
				new Task1(102, "Nick", "Noah", 23, "Mumbai", 761262),
				new Task1(103, "Solley", "Tim", 26, "Delhi", 125377),
				new Task1(104, "Path", "Tinna", 24, "Jammun", 272876),
				new Task1(105, "Sam", "Sober", 27, "Cochin", 823780),
				new Task1(106, "Alina", "John", 22, "Hyderabad", 907897));
		
		assertThat(listActual, hasItems(new Task1(106, "Alina", "John", 22, "Hyderabad", 907897)));
		
		assertThat(listActual.size(), is(6));
		
		//assertThat(listActual.get(3).getfName());
	
	}
	
	@Test
	public void testUserNameIsNull() {
		assertThrows(IllegalArgumentException.class,new Executable() {
			@Override
			public void execute() throws Throwable{
				Task1 data=new Task1();
				data.setfName(null);
				
			}
		});
	}
	@Test
	public void testNameIsNull() {
		Throwable exception=assertThrows(IllegalArgumentException.class,
				()->{
					Task1 obj=new Task1();
					obj.setAge(25);
				});
		assertEquals("Your age is 25",exception.getMessage());
	}
	
	/*@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test(expected = IllegalArgumentException.class)
	public void testNameValues()
	{
		Task1 obj=new Task1();
		
		obj.setAge(25);
	}*/
	
}
