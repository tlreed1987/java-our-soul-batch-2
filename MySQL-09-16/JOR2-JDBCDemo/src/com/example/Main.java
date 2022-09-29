
package com.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.dao.EmployeeDao;
import com.example.dao.EmployeeException;
import com.example.dao.EmployeeFactory;
import com.example.pojos.Employee;

public class Main {
	
	public static void main(String[] args) {
		
		 EmployeeDao dao=EmployeeFactory.get();
		 
		 
		 Employee emp=new Employee(8,"Harris",4132.12,102);
		 
		 try {
			String s=dao.register(emp);
			System.out.println(s);
		} catch (EmployeeException e1) {
			System.out.println(e1);
			
		}
//		
//		 List<Employee> eList;
//		try {
//			eList = dao.findAll();
//			eList.forEach(e->System.out.println(e));
//		   
//		} catch (EmployeeException e1) {
//			System.out.println(e1);
//		}
		 
//		 Employee e;
//			try {
//				e = dao.findById(5);
//				System.out.println(e);
//			   
//			} catch (EmployeeException e1) {
//				System.out.println(e1);
//			}
	}

}
