package com.example.services;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
@Stateless
public class EmployeeJAX {
	@WebMethod
	public String get(String name) {
		return "Good Evening"+name;
	}

}
