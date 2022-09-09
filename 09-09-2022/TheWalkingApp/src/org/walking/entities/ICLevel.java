package org.walking.entities;

public class ICLevel extends Employee {
	
	private String projectName;

	public ICLevel(int id, String name, double salary, String projectName) {
		super(id, name, salary);
		this.projectName=projectName;
		
	}
	
	public void print() {
		super.print();
		System.out.println("Project Name:"+this.projectName);
	}

	@Override
	public void raiseSalary(double amount) {
		this.salary+=amount;
		
	}
	

}
