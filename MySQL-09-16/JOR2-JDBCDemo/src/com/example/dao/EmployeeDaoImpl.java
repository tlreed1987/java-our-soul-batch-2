package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.pojos.Department;
import com.example.pojos.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	public Connection getConnection() throws SQLException{
		String jdbcURL="jdbc:mysql://localhost:3306/javaoursoul2";
		Connection con=DriverManager.getConnection(jdbcURL,"root","admin#123");
		return con;
	}
	
	@Override
	public List<Employee> findAll() throws EmployeeException {
		List<Employee> empList=new ArrayList<>();
	
		try(Connection con=getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from employee"))
		{
		  	while(rs.next()) {
				int id=rs.getInt("EMP_ID"); //int id=rs.getInt(1); //
				String name=rs.getString("name");
				double salary=rs.getDouble("salary");
				int did=rs.getInt("DEPT_ID");
				empList.add(new Employee(id,name,salary,did));
		      }
			
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage(),e);
		}
		
		return empList;
	}

	@Override
	public String register(Employee emp) throws EmployeeException {
		
		PreparedStatement st=null;
		String message="";
		try(Connection con=getConnection()){
			//String query="insert into employee values("+emp.getId()+",'"+emp.getName()+"',"+emp.getSalary()+","+emp.getDeptId()+")";
			String query="insert into employee values(?,?,?,?)";
			st=con.prepareStatement(query);
			st.setInt(1, emp.getId());
			st.setString(2, emp.getName());
			st.setDouble(3, emp.getSalary());
		//	st.setInt(4, emp.getDeptId());
			int n=st.executeUpdate();
			
			if(n==1) {
				message="Hi "+emp.getName()+ ", You are registred successfully";
			}
		}catch(SQLException s) {
			message="Error while inserting a record";
			throw new EmployeeException(s.getMessage(),s);
		}
	
		return message;
	}
	public Employee findById(int id) throws EmployeeException {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		Employee emp = null;
		try {
			con=getConnection();
			st=con.createStatement();
			rs=st.executeQuery("select * from employee where EMP_ID=" +id);
				if(rs.next()) {
					int eid=rs.getInt("EMP_ID"); //int id=rs.getInt(1); //
					String name=rs.getString("name");
					double salary=rs.getDouble("salary");
					int did=rs.getInt("DEPT_ID");
					emp = new Employee(eid,name,salary,did);
				}
			}
		catch (SQLException s) {
			throw new EmployeeException(s.getMessage(),s);
		}finally {
			try {
				rs.close();
				st.close();
				con.close();
			}catch(SQLException s) {
				System.out.println(s); // logger to store it in file. 
			}
		}
		return emp;
	}

	@Override
	public Department findDepartment(int id) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}


}
