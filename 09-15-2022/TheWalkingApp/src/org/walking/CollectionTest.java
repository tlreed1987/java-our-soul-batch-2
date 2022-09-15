package org.walking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.walking.entities.Employee;
import org.walking.entities.Manager;

public class CollectionTest {

	public static void main(String[] args) {
	      List<String> nameList=new ArrayList<>(); // Object type
	      nameList.add("nitin");
	      nameList.add("alex");
	      nameList.add("Harris");
	      nameList.add("Nick");
	      nameList.add("Yonas");
	      nameList.add("Sush");
	      nameList.add("Jeenal");
	      nameList.add("Dereje");
	      nameList.add("Eric");
	      Collections.sort(nameList);
	       System.out.println(nameList);
	      System.out.println("\n***************");
	      nameList.forEach(s->System.out.print(s.toUpperCase()+","));
	      System.out.println("\n***************");
	      System.out.println(nameList);
	      
	      nameList.replaceAll(s->s.toUpperCase());
	      System.out.println("\n***************");
	      System.out.println(nameList);
	      
	      
	}

}
