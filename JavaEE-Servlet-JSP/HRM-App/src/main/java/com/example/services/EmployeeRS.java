package com.example.services;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.example.ejb.EmployeeDao;
import com.example.ejb.EmployeeException;
import com.example.model.Employee;

@Stateless @Path("emp-rest")
public class EmployeeRS {
	@EJB//(lookup="global/hrm/EmployeeDaoImpl2", mappedName="global/hrm/EmployeeDaoImpl2")
	 private EmployeeDao dao;
	//@Path("name")
    //@WebMethod
	@GET
	@Path("/{name}")
	public String get(@PathParam("name") String name) {
		//write a program to determine greeting message accourding to system time
		return "Good Evening "+name;
	}
	@GET
	@Path("find/{id}") @Produces("application/xml,application/json")
	public Employee find(@PathParam("id") int id) throws EmployeeException {
		return dao.findById(id);
	}

	

}
