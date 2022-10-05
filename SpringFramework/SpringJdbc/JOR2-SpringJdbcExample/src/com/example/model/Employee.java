package com.example.model;
public class Employee {
		private int id;
		private String name;
		private double salary;
		private int deptId;
		
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
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public int getDeptId() {
			return deptId;
		}
		public void setDeptId(int deptId) {
			this.deptId = deptId;
		}
		
}
