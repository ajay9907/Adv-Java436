package com.CRUD;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private int eid;
	private String name;
	private double salary;
	private String city;

	public Employee(int id, String name, double salary, String city) {
		super();
		this.eid = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
	}

	public Employee() {
		super();

	}

	public int getId(int id) {
		return id;
	}

	public void setId(int id) {
		this.eid = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
