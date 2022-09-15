package org.walking.entities;

public class Manager extends Employee {
	private String deptName;
	
	public Manager(int id, String name, double salary, String deptName) {
		super(id,name,salary);
		this.deptName=deptName;
	}
	
	public Manager(int id, String name, double salary) {
		super(id,name,salary);
		
	}
	
	public String getDeptName() {
		return deptName;
	}

	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
	@Override
	public void print() {
		super.print();
		System.out.println("Dept Name:"+this.deptName);
	}

	@Override
	public void raiseSalary(double amount) {
		this.salary+=amount;
		this.salary+=500;
		
	}

	@Override
	public String toString() {
		return super.toString() + " deptName=" + this.deptName;
	}
	
	
}
