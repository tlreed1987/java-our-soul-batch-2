package com.example.model;

import java.util.List;

public interface EmployeeDao {
		List<Employee> findAll();
		int register(Employee e); 
		//update
		//delete
}
