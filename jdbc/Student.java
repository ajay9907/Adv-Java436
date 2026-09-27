package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Student {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("class Loaded");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_db", "root", "root");

		Statement s = c.createStatement();

		// Inserting Values ,updating ,deleting for use executeUpdateQuery()

//		s.executeUpdate("insert into student (s_id,s_name,course,fees)values(103,'Snehal','Python',90000)");
//		s.executeUpdate("insert into student(s_id,s_name,course,fees)values(102,'Ajay','java',25000)");
//		s.executeUpdate("insert into student(s_id,s_name,course,fees)values(104,'Shiv','java',25000)");
//		s.executeUpdate("insert into student(s_id,s_name,course,fees)values(105,'Ajyaa','java',20000)");

//		s.executeUpdate("update student set course ='Python' where s_id=102");

		s.executeUpdate("delete from student where s_id=104");
		System.out.println("Delete Record Successfully ");
		c.close();
	}

}
