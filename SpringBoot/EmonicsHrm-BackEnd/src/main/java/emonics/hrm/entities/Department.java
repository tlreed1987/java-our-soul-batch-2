package emonics.hrm.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity @Data
public class Department {
	@Id @Column(name="DEPT_ID")
	private int id;
	private String name;
	private String location;
	//@JsonIgnore
	@JsonBackReference
	@OneToMany(mappedBy="dept")
	private List<Employee> empList;
}
