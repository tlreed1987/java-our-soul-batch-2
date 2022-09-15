package com.example;

public class Employee {
	private int id;
	private String name;
	
	private Employee(Builder b) {
		this.id=b.id;
		this.name=b.name;
	}
	
	public static class Builder{
		private int id;
		private String name;
		
		public Builder id(int id) {
			this.id=id;
			return this;
		}
		public Builder name(String name) {
			this.name=name;
			return this;
		}
		
		public Employee build() {
			return new Employee(this);
		}
	} // end of Builder class

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
		
	
}//end of Employee
