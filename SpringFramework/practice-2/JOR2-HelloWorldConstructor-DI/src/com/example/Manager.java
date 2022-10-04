package com.example;

public class Manager extends Employee {
		public Manager(int id, String name, double salary, String deptName, Address add) {
		super(id, name, salary, add);
		this.deptName=deptName;
		
	}

		private String deptName;

		public String getDeptName() {
			return deptName;
		}

		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}

		@Override
		public String toString() {
			return "Manager ["+super.toString() + ",deptName=" + this.deptName+"]";
		}
		
		
}
