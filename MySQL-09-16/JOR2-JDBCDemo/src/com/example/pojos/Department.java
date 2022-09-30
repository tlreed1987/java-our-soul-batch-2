package com.example.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import java.util.List;

@Entity 
@Data
public class Department {
	@Id
	@Column(name="DEPT_ID")
	private int id;
	private String name;
	private  String location;
	
	@OneToMany(mappedBy="dept", fetch=FetchType.EAGER)
	private List<Employee> emplist;

}
