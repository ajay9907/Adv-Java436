package com.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");

		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();

		Session ss = sf.openSession();

		Transaction tr = ss.beginTransaction();

		int id = 123;
		Employee e = ss.get(Employee.class, id);

		ss.delete(e);
		System.out.println("Deleted...!");
		tr.commit();
		ss.close();

	}
}