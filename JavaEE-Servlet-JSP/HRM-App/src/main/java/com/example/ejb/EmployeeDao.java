package com.example.ejb;

import java.util.List;

import javax.ejb.Local;

import com.example.model.Employee;
@Local
public interface EmployeeDao {
	public List<Employee> findAll() throws EmployeeException;
	public String register(Employee e) throws EmployeeException;
	public Employee findById(int id) throws EmployeeException;
	//public int remove(int id) throws EmployeeException();
	//public String update(Employee e) throws EmployeeException;
}
