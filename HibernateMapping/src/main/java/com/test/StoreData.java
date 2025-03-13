package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		Address adr1 = new Address();
		
		adr1.setCity("Chennai");
		adr1.setState("TN");
		adr1.setCountry("IN");
		
		Employee emp1 = new Employee();
		
		emp1.setEmp_name("Dhoni");
		emp1.setEmp_email("dhoni@gmail.com");
		emp1.setAddress(adr1);
		
		adr1.setEmployee(emp1);
		
		session.save(emp1);

		t.commit();
		
		System.out.println("Done.");
		
		session.close();
	}
}
