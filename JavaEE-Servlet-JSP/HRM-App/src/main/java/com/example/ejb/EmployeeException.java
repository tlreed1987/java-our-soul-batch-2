package com.example.ejb;

public class EmployeeException extends Exception {

	public EmployeeException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public EmployeeException(String message) {
		super(message);
		
	}

}
