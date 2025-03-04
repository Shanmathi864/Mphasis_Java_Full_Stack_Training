package Shanmathi_Program_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Exp4 {

	public static void main(String[] args) {
		
		ArrayList<String> listNames =new ArrayList<>();
		
		listNames.add("java");
		listNames.add("python");
		listNames.add("spring");
		listNames.add("microservices");
		listNames.add("hibernate");
		listNames.add("Bootstrap");
		listNames.add("Html");
		listNames.add("Css");
		listNames.add("Angular");
		listNames.add("React");
		
		Iterator<String> itr = listNames.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
        ListIterator<String> ltr = listNames.listIterator();
        
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		
		for(String dt: listNames)
		{
			System.out.println(dt);
			
		}
	}
	

}
