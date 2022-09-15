package org.walking.entities;

public class Admin extends Employee {

	public Admin(int id, String name, double salary) {
		super(id, name, salary);
		
	}

	@Override
	public void raiseSalary(double amount) {
		
		this.salary+=amount;
	}

}
