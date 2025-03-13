package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		Book b = new Book();
		
		//b.setId(1);
		b.setB_name("Rohan");
		b.setB_author("RodJ");
		b.setB_price(123);
		
		//session.save(b);
		
		t.commit();
		
		Book bobj = session.get(Book.class, 2);
		 
		session.delete(b);
		
		System.out.println(bobj.getId()+" "+bobj.getB_name()+" "+bobj.getB_author()+" "+bobj.getB_price()); 

		bobj.setB_name("Servlet");
		
		session.save(bobj);
		
		//t.commit();
		
		System.out.println("Done.");
		
		session.close();
	}
}
