package emonics.hrm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import emonics.hrm.entities.Department;
import emonics.hrm.entities.Employee;

@Repository
public interface DepartmentDao extends JpaRepository<Department,Integer> {
		
}
