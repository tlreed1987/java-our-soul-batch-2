package com.example.model;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao {
	//@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Employee> findAll() {
		
		return null;
	}

	@Override
	public int register(Employee e) {
		String query="insert into employee values("+e.getId()+",'"+e.getName()+"',"+e.getSalary()+","+e.getDeptId()+")";
		return jdbcTemplate.update(query);
		
	}
	
	


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

}
