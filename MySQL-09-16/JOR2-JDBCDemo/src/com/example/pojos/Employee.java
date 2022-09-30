package com.example.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="EMPLOYEE")
@Data
public class Employee {
	@Id
	@Column(name="EMP_ID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="SALARY")
	private double salary;
	
//	@Column(name="DEPT_ID")
//	private int deptId;
	
	@ManyToOne
	@JoinColumn(name="DEPT_ID", nullable=false, updatable=false, referencedColumnName="DEPT_ID")
	private Department dept;

	public Employee() {
		
	}
	public Employee(int id, String name, double salary, int deptId) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	public Employee(int id, String name, double salary, Department d) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept=d;
		
	}
		
}
