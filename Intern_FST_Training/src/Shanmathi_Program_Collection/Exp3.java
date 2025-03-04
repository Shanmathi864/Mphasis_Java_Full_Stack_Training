package Shanmathi_Program_Collection;

import java.util.Enumeration;
import java.util.Stack;

public class Exp3 {

	public static <E> void main(String[] args)
	{
		Stack data =new Stack();
		data.add(10);
		data.add("java");
		data.add(202);
		data.add("Shanmathi");
		data.add(33.86f);
		data.add(23.44d);
		data.add(90887766554l);
		data.add('a');
		data.add('A');
		data.add(false);
		System.out.println(data);
		System.out.println(data.peek());
		System.out.println("king");
		System.out.println(data.peek());
		System.out.println(data.pop());
		System.out.println(data.peek());
		System.out.println(data.search(202));
		System.out.println(data.empty());
		data.clear();
		System.out.println(data);
		Enumeration<E> itr = data.elements();
		while(itr.hasMoreElements())
		{
			System.out.println(itr.nextElement());
		}
	}
}
