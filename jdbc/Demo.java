package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) throws Exception, SQLException {

//		steps 1 : Add Jar File 

		// step 2 : register &load Driver class

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Class Loaded");

		// step 3: build connection using driver manager
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_db", "root", "root");
		// used statement and Prepared Statement
		System.out.println("Registration Successfully");

		Statement s = c.createStatement();
        //used Query
		int checked = s.executeUpdate("insert into employee2(e_id,emp_name,salary,dept)values(201,'Ajyaa',67000,'IT')");

		if (checked > 0) {
			System.out.println("Row Insert Successfully");
		} else {
			System.out.println("Not Insert ...");
		}
		// close all connection

		c.close();
	}

}
