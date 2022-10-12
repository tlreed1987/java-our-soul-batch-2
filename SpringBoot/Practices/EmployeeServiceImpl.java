package jor.empapp.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jor.empapp.dao.EmployeeDao;
import jor.empapp.model.Contact;
import jor.empapp.model.Employee;
import jor.empapp.model.EmployeeContact;
import jor.empapp.model.Message;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private static final Logger logger=LogManager.getLogger(EmployeeServiceImpl.class);
	@Autowired
	EmployeeDao dao;
	
	
	@Override
	public Iterable<Employee> findAll() {
		// TODO Auto-generated method stub
		Sort s=Sort.by("name");
		Iterable<Employee> emplist=dao.findAll(s.descending());
		logger.info("Found All Employee");
		return emplist;
	}


	@Override
	public Message addEmployee(Employee e) {
		Message m=new Message();
		try {
		   dao.save(e);
		   logger.info("Employee added succesfully");
		   m.setS("Success");
		}catch(Exception ex) {
			m.setS("Error:"+ex);
			logger.error("Error:"+ex);
			ex.printStackTrace();
		}
		return m;
	}


	@Override
	public Employee find(int id) {
		Employee e=new Employee();
		e.setName(id+" does not Exist");
		Optional<Employee> eop=dao.findById(id);
		if(eop.isPresent()) {
			e=eop.get();
			logger.info(id+" Employee found");
		}
		return e;
	}


	@Override
	public List<Employee> find(String name) {
		// TODO Auto-generated method stub
		return dao.findByNameContaining(name);
	}
	
	
}
