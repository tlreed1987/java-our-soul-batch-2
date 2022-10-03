package com.example.ejb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.example.model.Employee;
@Stateless(name="b2")
public class EmployeeDaoImpl2 implements EmployeeDao{

	public SessionFactory getConnection() throws SQLException{
		SessionFactory f=new Configuration().configure("/com/example/hibernate.cfg.xml").buildSessionFactory();
		return f;
		
	}
	
	//@Override
	public List<Employee> findAll() throws EmployeeException {
		List<Employee> empList=null;
		try(SessionFactory sf=getConnection();
				Session s=sf.openSession()) {
				//String q="select e from Employee e";
				//Query<Employee> tq=s.createQuery(q, Employee.class);
			     Query<Employee> tq=s.createNamedQuery("findAllEmployee", Employee.class);
				empList=tq.getResultList();
			
		}catch(HibernateException | SQLException ex) {
			ex.printStackTrace();
		}
		return empList;
	}

	//@Override
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
		System.out.println("impl2");
		Employee emp=null;
		
		try(SessionFactory sf=getConnection();
				Session s=sf.openSession()) {
			emp=s.get(Employee.class, id);
			
		}catch (HibernateException e) {
			// TODO Auto-generated catch block
			throw new EmployeeException(e.getMessage(),e);
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new EmployeeException(e.getMessage(),e);
		}
		
		return emp;
	}

	

}
