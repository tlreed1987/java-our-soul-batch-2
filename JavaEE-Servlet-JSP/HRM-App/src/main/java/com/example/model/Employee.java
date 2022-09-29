package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
@XmlRootElement
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
	
	@Column(name="DEPT_ID")
	private int deptId;

	public Employee() {
		
	}
	public Employee(int id, String name, double salary, int deptId) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptId = deptId;
	}
		
}
