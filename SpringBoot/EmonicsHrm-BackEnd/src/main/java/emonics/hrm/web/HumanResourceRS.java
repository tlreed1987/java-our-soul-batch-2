package emonics.hrm.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import emonics.hrm.dao.DepartmentDao;
import emonics.hrm.dao.EmployeeDao;
import emonics.hrm.entities.Department;
import emonics.hrm.entities.Employee;

@RestController @RequestMapping("/hr")
public class HumanResourceRS {
	
	@Autowired
	private EmployeeDao dao;
	
	@Autowired
	private DepartmentDao deptdao;
	
	@GetMapping("/emp/{id}")
	public Employee find(@PathVariable int id) {
		Optional<Employee> opt=dao.findById(id);
		Employee e=new Employee();
		if(opt.isPresent()) {
			e=opt.get();
		}
		return e;
	}
	
	@GetMapping("emp/all")
	public Iterable<Employee> findAll() {
		Sort s=Sort.by(Sort.Direction.DESC,"name");
		Iterable<Employee> empList=dao.findAll(s);
		return empList;
	}
	
	@GetMapping("emp/all/bySalary/{amt}")
	public List<Employee> findAllBySalary(@PathVariable double amt) {
		List<Employee> empList=dao.findAllEmployee(amt);
		return empList;
	}
	@GetMapping("dept/all")
	public Iterable<Department> findAllDept() {
		Iterable<Department> dList=deptdao.findAll();
		return dList;
	}
	
}
