package com.Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Employee")

public class Servlet_Demo extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("empName");

		req.getParameter("age");
		int age = Integer.parseInt("age1");

		String city = req.getParameter("city");

		String email = req.getParameter("email");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_practice_session", "root",
					"root");

			PreparedStatement ps = c.prepareStatement("insert into employee(Emp_name,city,age,email)values(?,?,?,?)");

			ps.setString(1, name);
			ps.setInt(2, age);
			ps.setString(3, city);
			ps.setString(4, email);

			int checked = ps.executeUpdate();
			if (checked > 0) {
				System.out.println("Register Successfully");
			} else {
				System.out.println("Fail Registration");
			}

		} catch (Exception e) {

		}
	}
}
