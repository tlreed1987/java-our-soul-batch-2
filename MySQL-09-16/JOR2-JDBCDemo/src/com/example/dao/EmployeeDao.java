package com.example.dao;

import java.util.List;

import com.example.pojos.Department;
import com.example.pojos.Employee;

public interface EmployeeDao {
	public List<Employee> findAll() throws EmployeeException;
	public String register(Employee e) throws EmployeeException;
	public Employee findById(int id) throws EmployeeException;
	public Department findDepartment(int id) throws EmployeeException;
	//public int remove(int id) throws EmployeeException();
	//public String update(Employee e) throws EmployeeException;
}
