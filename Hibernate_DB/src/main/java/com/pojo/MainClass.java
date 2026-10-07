package com.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {

		// dbConnection

		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");

		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();

		Session ss = sf.openSession();

		Transaction tr = ss.beginTransaction();

		// INSERTION

		Student s = new Student();
		s.setId(13);
		s.setName("jay");
		s.setAge(11);
		s.setCity("Pune");

		ss.persist(s);

		tr.commit();
		
		ss.close();

	}
}
