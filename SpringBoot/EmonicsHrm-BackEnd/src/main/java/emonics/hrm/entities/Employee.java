package emonics.hrm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Entity @Table(name="EMPLOYEE") // default mapping to same name table as class
@Setter @Getter
public class Employee{
	@Id @Column(name="EMP_ID")
	private int id;
	private String name;  // default colum mapping to same name properties
	private double salary;
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name="DEPT_ID", referencedColumnName="DEPT_ID")
	private Department dept;
}
