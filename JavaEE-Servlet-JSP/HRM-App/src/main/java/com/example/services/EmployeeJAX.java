package com.example.services;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.example.ejb.EmployeeDao;
import com.example.ejb.EmployeeDaoImpl2;
import com.example.ejb.EmployeeException;
import com.example.model.Employee;


@WebService
@Stateless
public class EmployeeJAX {
	@EJB(beanName="b2")
	 private EmployeeDao dao;
	@WebMethod(operationName="greet")
	public String get(String name) {
		return "Greeting, "+name;
	}
	
	public Employee find(int id) throws EmployeeException {
		return dao.findById(id);
	}

}
