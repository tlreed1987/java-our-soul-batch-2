package com.example.services;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.ws.rs.Path;

@Stateless @Path("services")
public class EmployeeRS {
	
	@Path("name")
    @WebMethod
	public String get(String name) {
		return "Good Evening"+name;
	}


}
