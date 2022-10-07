package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.model.Employee;

@SpringBootApplication
public class Jor2HelloWordApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx=SpringApplication.run(Jor2HelloWordApplication.class, args);
		Employee e=(Employee) ctx.getBean(Employee.class);
		e.setName("Nitin");
		System.out.println(e.getName());
	}

}
