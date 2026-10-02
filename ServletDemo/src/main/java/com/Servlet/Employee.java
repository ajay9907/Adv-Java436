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

@WebServlet("/Employeeregister")
public class Employee extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {

			// Load MySQL Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Create Connection
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_db", "root", "root");

			// Get data from HTML form
			int id = Integer.parseInt(req.getParameter("id"));

			String name = req.getParameter("name");

			int age = Integer.parseInt(req.getParameter("age"));

			String city = req.getParameter("city");

			// Create PreparedStatement
			PreparedStatement ps = c.prepareStatement("INSERT INTO Employee(id, name, age, city) VALUES (?, ?, ?, ?)");

			// Set values
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setString(4, city);

			// Execute query
			int checked = ps.executeUpdate();

			if (checked > 0) {
				resp.getWriter().println("Registration Successfully");
			} else {
				resp.getWriter().println("Registration Failed");
			}

			ps.close();
			c.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
