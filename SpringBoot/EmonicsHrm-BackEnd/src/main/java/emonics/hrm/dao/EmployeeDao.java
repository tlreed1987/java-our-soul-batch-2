package emonics.hrm.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import emonics.hrm.entities.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee,Integer> {

}
