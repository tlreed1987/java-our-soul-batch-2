package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.pojos.Department;
import com.example.pojos.Employee;

public class EmployeeDaoImpl2 implements EmployeeDao{

	public SessionFactory getConnection() throws SQLException{
		SessionFactory f=new Configuration().configure("/com/example/hibernate.cfg.xml").buildSessionFactory();
		return f;
		
	}
	
	@Override
	public List<Employee> findAll() throws EmployeeException {
		
		return null;
	}

	@Override
	public String register(Employee emp) throws EmployeeException {
		String message=null;
		try(SessionFactory sf=getConnection();
				Session s=sf.openSession()) {
			   try {
					s.getTransaction().begin();
						s.save(emp);
					
				
					s.getTransaction().commit();
					message=emp.getName()+", you are registered";
			   }catch(Exception ex) {
				   s.getTransaction().rollback();
				   message="Something went wrong while inserting record:"+ex.getMessage();
			   }
		}catch (HibernateException e) {
			// TODO Auto-generated catch block
			message="Something went wrong while inserting record:"+e.getMessage();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			message="Something went wrong while inserting record:"+e.getMessage();
		}
		
		return message;
	}
	public Employee findById(int id) throws EmployeeException {
		Employee emp=new Employee();
		System.out.println(emp.hashCode());
		try(SessionFactory sf=getConnection();
				Session s=sf.openSession()) {
			emp=s.get(Employee.class, id);
			System.out.println(emp.hashCode());
		}catch (HibernateException e) {
			// TODO Auto-generated catch block
			throw new EmployeeException(e.getMessage(),e);
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new EmployeeException(e.getMessage(),e);
		}
		
		return emp;
	}

	public Department findDepartment(int id) throws EmployeeException {
		Department d=null;
		
		try(SessionFactory sf=getConnection();
				Session s=sf.openSession()) {
			d=s.get(Department.class, id);
			
		}catch (HibernateException e) {
			// TODO Auto-generated catch block
			throw new EmployeeException(e.getMessage(),e);
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new EmployeeException(e.getMessage(),e);
		}
		
		return d;
	}

}
