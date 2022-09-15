package org.walking.entities;

public abstract class Employee implements Comparable<Employee>{
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


	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary;
	}

	@Override
	public int compareTo(Employee e) {
		//0 if two objects are same
		//negative number(-1) if 1st obj is smaller than 2nd
		//positive number(1) if 1st obj is bigger than 2nd
		if(this.salary<e.salary) {
			return 1;
		}else if(this.salary>e.salary) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
	

}
