package Junit_test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.jupiter.api.Test;

import junit_maven.Fruits;

public class CollectionTest {

	@Test
	public void testListOfNumbers()
	{
		List<Integer> listNum = Arrays.asList(10, 20, 30, 40, 50, 60);
		List<Integer> expctData = Arrays.asList(10, 20, 30, 40, 50, 60);
		
		//assertEquals(expctData, listNum);
		
		//assertThat(listNum, is(expctData));
		
		//assertThat(listNum, hasItems(30));
		
		//assertThat(listNum.size(), is(6));
		
		//assertThat(listNum, IsEmptyCollection.empty());
		
		//assertThat(listNum, everyItem(greaterThanOrEqual));
		
	}
	@Test
	public void testCollectionObjects()
	{
		List<Fruits> listActual = Arrays.asList(
				new Fruits("banana", 5),
				new Fruits("Apple",100),
				new Fruits("Strawberry", 60),
				new Fruits("Orange", 90),
				new Fruits("Grapes", 50));
		
		assertThat(listActual, hasItems(new Fruits("Orange", 90)));
	}
}
