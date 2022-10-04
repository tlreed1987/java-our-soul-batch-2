package com.example;

public class Manager extends Employee {
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
