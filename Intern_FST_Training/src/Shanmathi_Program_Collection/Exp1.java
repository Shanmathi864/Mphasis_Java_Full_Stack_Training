package Shanmathi_Program_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class Exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList data = new ArrayList();
		
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
		System.out.println(data.size());
		data.set(4, "shan");
		System.out.println(data);
		data.remove(2);
		System.out.println(data);
		System.out.println(data.get(7));
		System.out.println(data.contains(103));
		//Iterator itr =data.iterator();
		
		ListIterator ltr =data.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		/*for(Object obj: data)
		{
			System.out.println(obj);
			
		}*/
	}

}
