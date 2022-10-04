package com.example;

import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public  class Employee implements InitializingBean {
	private int id;
	private String name;
	private double salary;
	private Address add;
	
	
	public Employee() {
		
	}

	public Employee(int id, String name, double salary, Address add) {
	
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.add = add;
	}
	
	public void init() {
		this.id=-1;
		this.name="Anonymous";
		this.salary=-1.0;
	}
	public void destroy() {
		System.out.println(1);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public Address getAdd() {
		return add;
	}
	@Autowired @Qualifier("add1")
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Hello");
		
	}
	
	

}
