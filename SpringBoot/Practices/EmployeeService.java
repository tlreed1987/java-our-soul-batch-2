package jor.empapp.service;

import java.util.List;

import jor.empapp.model.Contact;
import jor.empapp.model.Employee;
import jor.empapp.model.EmployeeContact;
import jor.empapp.model.Message;

public interface EmployeeService {
	
	public Iterable<Employee> findAll();
	public Message addEmployee(Employee e);
	public Employee find(int id);
	public List<Employee> find(String name);
}
