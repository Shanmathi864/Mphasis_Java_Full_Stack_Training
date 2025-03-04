package Shanmathi_Program_Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Exp7 {

	public static void main(String[] args) {
		
		TreeSet data =new TreeSet<>();
		
		data.add("java");
		data.add("king");
		data.add("rohit");
		data.add("Rohit");
		data.add("Shan");
		data.add("arul");
		data.add("Vaj");
		
		System.out.println(data);

		Iterator itr = data.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		data.forEach(x -> System.out.println(x));
		
		System.out.println(data.subSet("Shan", "java"));
		System.out.println(data.getFirst());
		System.out.println(data.getLast());
	}

}
