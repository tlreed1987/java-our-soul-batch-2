package org.walking.entities;

public abstract class Employee {
	private final int id;
	private String name;
	protected double salary;
	
	public Employee(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	
	public int getId() {
		return id;
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
	public abstract void raiseSalary(double amount);
	
	public void print() {
		System.out.println("Id:"+this.id);
		System.out.println("Name:"+this.name);
		System.out.println("Salary:"+this.salary);
	}
	

}
