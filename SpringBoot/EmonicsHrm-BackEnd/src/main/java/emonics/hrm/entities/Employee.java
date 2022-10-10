package emonics.hrm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity @Table(name="EMPLOYEE") // default mapping to same name table as class
@Setter @Getter
public class Employee{
	@Id @Column(name="EMP_ID")
	private int id;
	private String name;  // default colum mapping to same name properties
	private double salary;
	@Column(name="DEPT_ID")
	private int deptId;
}
