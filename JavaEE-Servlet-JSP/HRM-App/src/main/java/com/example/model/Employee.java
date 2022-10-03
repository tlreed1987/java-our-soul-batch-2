package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
@XmlRootElement
@Entity
@Table(name="EMPLOYEE")
@Data
@NamedQueries(
		{
			@NamedQuery(name="findAllEmployee", query="select e from Employee e"),
			@NamedQuery(name="findAllEmployeeByDept", query="select e from Employee e where e.deptId=:dpt")
		}
)
public class Employee implements Serializable {
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
