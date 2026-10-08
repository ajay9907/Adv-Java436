package com.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 115;
		Employee e = ss.get(Employee.class, id);

		e.setName("Mahadev");
		e.setCity("Wai");
		e.setSalary(1200);

		ss.update(e);

		tr.commit();
		ss.close();
		System.out.println("Updated ...!");
	}
}
