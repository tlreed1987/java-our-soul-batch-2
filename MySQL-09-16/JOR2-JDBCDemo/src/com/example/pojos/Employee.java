package com.example.pojos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import lombok.Data;

@Entity
@Table(name="EMPLOYEE")
@Data
@NamedQueries(
				@NamedQuery(name="findAll", query="select e from Employee")
		)
@Proxy(lazy=false)
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
