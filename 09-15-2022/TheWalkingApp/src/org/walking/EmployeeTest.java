package org.walking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.walking.entities.Admin;
import org.walking.entities.Employee;
import org.walking.entities.ICLevel;
import org.walking.entities.Manager;
import org.walking.util.SortEmployeeById;
import org.walking.util.SortEmployeeByName;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Manager(3, "Miyako", 4300.01,"Eng"));
		empList.add(new Admin(4, "Dereje", 2500.51));
		empList.add(new Manager(1, "Nitin", 2300.01,"OPS"));
		empList.add(new ICLevel(2, "Alex", 3300.01,"SOA"));
		empList.add(new ICLevel(5, "Kamila", 2500.61,"SOA"));
		
//		Collections.sort(empList);
//		empList.forEach(e->System.out.println(e));
//		System.out.println("**********************");
//		Collections.sort(empList,new SortEmployeeById());
//		empList.forEach(e->System.out.println(e));
//		System.out.println("**********************");
//		Collections.sort(empList, new SortEmployeeByName());
//		empList.forEach(e->System.out.println(e));
		
//		for(Employee e:empList) {
//			if(e.getSalary()>3000) {
//				System.out.println(e);
//			}
//		}
//		
//		System.out.println("**********************");
//		
//		empList.forEach(e->{
//			if(e.getSalary()>3000) {
//				System.out.println(e);
//			}
//		});
		
		System.out.println("**********************");
		empList.stream()
		       .filter(e->e.getSalary()>3000)
		       .forEach(e->System.out.println(e));
		
		System.out.println("**********************");
		empList.stream()
		       .filter(e->!(e instanceof Manager))
		       .filter(e->e.getSalary()<3000)
		       .forEach(e->System.out.println(e));
		
		System.out.println("**********************");
		double total=empList.stream()
		       .filter(e->!(e instanceof Manager))
		       .mapToDouble(e->e.getSalary())
		       .sum();
		System.out.printf("Total Salary Paid to Non-Managerial Employee is %.2f",total);
	}

}
