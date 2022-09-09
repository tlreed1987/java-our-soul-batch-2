package org.walking;

import org.walking.entities.Employee;
import org.walking.entities.ICLevel;
import org.walking.entities.Item;
import org.walking.entities.Manager;

public class Main {

	public static void main(String[] args) {
	
//		Employee[] empList=new Employee[4];
//		empList[0]=new Manager(1,"Nitin",2000.00);
//		empList[1]=new Manager(2,"Alex",3000.00);
//		empList[2]=new Manager(3,"Dereje",4000.00);
//		empList[3]=new Manager(4,"Gerges",5000.00);
//		
////		for(Employee e:empList) {
////			e.print();
////			System.out.println("_______________");
////			
////		}
//		for(int i=0; i<4; i++) {
//			empList[i].print();
//			System.out.println("_______________");
//		}
		Manager m=new Manager(1,"Nitin",2000.00,"Soft Dev");
		ICLevel i1=new ICLevel(11, "Alex", 1200.00, "Java App");
		m.raiseSalary(1000);
		m.print();
		i1.raiseSalary(800);
		i1.print();
		
	}
	

}
