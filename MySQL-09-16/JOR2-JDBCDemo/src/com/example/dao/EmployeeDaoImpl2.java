package com.example.dao;


import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;

import com.example.pojos.Department;
import com.example.pojos.Employee;

public class EmployeeDaoImpl2 implements EmployeeDao{

	public SessionFactory getConnection() throws SQLException{
		SessionFactory f=new Configuration().configure("/com/example/hibernate.cfg.xml").buildSessionFactory();
		return f;
		
	}
	
	@Override
	public List<Employee> findAll() throws EmployeeException {
		List<Employee> ls=null;
		
		try(SessionFactory sf=getConnection();
				Session s=sf.openSession()) {
			  Query<Employee> q=s.createNamedQuery("findAll", Employee.class);
			 
			  ls=q.getResultList();
			  
		}catch(Exception ex) {
			throw new EmployeeException(ex.getMessage(),ex);
		}
		
		return ls;
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
		
		try(SessionFactory sf=getConnection();
				Session s=sf.openSession()) {
			emp=s.load(Employee.class, id);
			
		}catch (HibernateException e) {
			// TODO Auto-generated catch block
			//throw new EmployeeException(e.getMessage(),e);
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
