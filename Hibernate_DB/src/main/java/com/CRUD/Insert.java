package com.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CRUD_Oper {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");

		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();

		Session ss = sf.openSession();

		Transaction tr = ss.beginTransaction();

		// set data also inserted data

//		Employee e = new Employee();

//		e.setId(115);
//		e.setName("Swapnali");
//		e.setSalary(36000.00);
//		e.setCity("Chandwad");
//
//		e.setId(117);
//		e.setName("Pratik");
//		e.setSalary(66000.00);
//		e.setCity("Barshi");
//
//		ss.persist(e);

		int id = 123;

		ss.get(Employee.class, id);
		ss.remove(id);

		System.out.println("Deleted....!");
		tr.commit();
		ss.close();

//		int id = 123;
//		Employee e = ss.get(Employee.class, id);
//		System.out.println(e);

	}
}
