package com.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");

		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();

		Session ss = sf.openSession();

		Transaction tr = ss.beginTransaction();

		// set data also inserted data

		Employee e = new Employee();

		e.setId(115);
		e.setName("Swapnali");
		e.setSalary(36000.00);
		e.setCity("Chandwad");
//
//		 
		ss.persist(e);
		System.out.println("Inserted...!");

		tr.commit();
		ss.close();
	}
}
