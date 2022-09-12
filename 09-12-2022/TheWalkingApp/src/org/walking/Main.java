package org.walking;

import org.walking.products.Clothing;
import org.walking.products.Footwear;
import org.walking.products.Returnable;
import org.walking.products.misc.Boots;
import org.walking.products.misc.CustomShirt;
import org.walking.products.misc.Flats;
import org.walking.products.misc.Shirt;

public class Main {
	
	public static void returnPolicy(Returnable r) {
		r.doReturn();
	}
	
	public static void print(Clothing c) {
		c.print();
		if(c instanceof Shirt) {
			returnPolicy((Returnable)c);
		}
	}
	
	public static void print(Footwear f) {
		f.print();
		if(f instanceof Flats) {
			returnPolicy((Returnable)f);
		}
	}

	public static void main(String[] args) {
	
		/*Employee[] empList=new Employee[3];

		empList[0]=new Manager(1,"Nitin",2000.00,"Soft Dev");
		empList[1]=new ICLevel(11, "Alex", 1200.00, "Java App");
		empList[2]=new Admin(21, "Jia", 1210.00);
		for(Employee e:empList) {
			e.print();
			System.out.println("***********");
		}*/
		Clothing[] cloths= {
				new Shirt(1, "Levis-TShirt", 5, 10, 40),
				new CustomShirt(4,"Custom Shirt-Cust1",20,2),
				new Shirt(2, "US-POLO-shirt", 8, 10, 38),
				new CustomShirt(5,"Custom Shirt-Cust2",22,1),
				new Shirt(3, "Adidas-Denim", 15, 10, 44)
		};
		Footwear[] footwears= {
				new Flats(101, "C-1001", 10.21, 10),
				new Flats(102, "C-1002", 11.56, 5),
				new Boots(103,"B-1200",23.50,4,false),
				new Boots(104,"B-1201",23.50,4,true),
		};
		for(Clothing c:cloths) {
			print(c);
		}
		System.out.println("*************Footwear************");
		
		for(Footwear f:footwears) {
			print(f);
		}
	}
	

}
