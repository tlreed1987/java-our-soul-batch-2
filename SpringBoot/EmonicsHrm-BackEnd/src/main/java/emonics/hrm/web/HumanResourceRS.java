package emonics.hrm.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import emonics.hrm.dao.EmployeeDao;
import emonics.hrm.entities.Employee;

@RestController @RequestMapping("/hr")
public class HumanResourceRS {
	
	@Autowired
	private EmployeeDao dao;
	@GetMapping("/{id}")
	public Employee find(@PathVariable int id) {
		Optional<Employee> opt=dao.findById(id);
		Employee e=new Employee();
		if(opt.isPresent()) {
			e=opt.get();
		}
		return e;
	}
	@GetMapping("/a")
	public String get() {
		return "test";
	}
}
