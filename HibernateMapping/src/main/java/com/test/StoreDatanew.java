package com.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreDatanew {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate1.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		Address adr1 = new Address();
		
		Skills skl1 = new Skills();
		
		skl1.setS_name("Spring");
		
        Skills skl2 = new Skills();
		
		skl2.setS_name("Hibernate");
		
		List<Skills> listSkl = new ArrayList<>();
		
		listSkl.add(skl1);
		listSkl.add(skl2);
		
		Student std = new Student();
	
		std.setStd_name("Rohit");
		std.setSkills(listSkl);
		
		session.save(std);

		t.commit();
		
		System.out.println("Done.");
		
		session.close();
}
}
