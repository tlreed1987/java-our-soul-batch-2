
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
import com.example.pojos.Department;
import com.example.pojos.Employee;

public class Main {
	
	public static void main(String[] args) {
		
		 EmployeeDao dao=EmployeeFactory.get();
		 
			try {
				Department d = dao.findDepartment(101);
				Employee emp=new Employee(8,"Harris",4132.12,d);
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
//		 
//		 Employee e=null;
//			try {
//				e = dao.findById(5);
//				System.out.println("Id:"+e.getId());
//				System.out.println("Name:"+e.getName());
//				System.out.println("Salary:"+e.getSalary());
//				System.out.println("Dept Id::"+e.getDept().getId());
//				System.out.println("DeptName:"+e.getDept().getName());
//				System.out.println("Location:"+e.getDept().getLocation());
//			} catch (EmployeeException e1) {
//				System.out.println(e1);
//			}
		 Department d=null;
			try {
				d = dao.findDepartment(101);
				System.out.println("Id:"+d.getId());
				System.out.println("Name:"+d.getName());
				System.out.println("Location:"+d.getLocation());
				System.out.println("******Employee Details ***** ");
				d.getEmplist().forEach(e-> {
						System.out.println("Id:"+e.getId());
						System.out.println("Name:"+e.getName());
						System.out.println("Salary:"+e.getSalary());
						System.out.println("***********************");
				});
				
			} catch (EmployeeException e1) {
				System.out.println(e1);
			}
	}

}
