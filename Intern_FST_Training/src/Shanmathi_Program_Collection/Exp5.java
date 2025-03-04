package Shanmathi_Program_Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Exp5 {

	public static void main(String[] args) {
		
		HashSet data = new HashSet();
		
		data.add("java");
		data.add(100);
		data.add('a');
		data.add("java");
		data.add(100);
		data.add(10);
		data.add(33.33f);
		data.add(22.22d);
		data.add("rohit");
		
		System.out.println(data);
		
		Iterator itr =data.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		data.forEach(x -> System.out.println(x));
		

	}

}
