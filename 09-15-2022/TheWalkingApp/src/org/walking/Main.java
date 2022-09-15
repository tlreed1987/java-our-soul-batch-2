package org.walking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.walking.products.Clothing;
import org.walking.products.Footwear;
import org.walking.products.Returnable;
import org.walking.products.misc.Boots;
import org.walking.products.misc.CustomShirt;
import org.walking.products.misc.Flats;
import org.walking.products.misc.Shirt;
import org.walking.util.ProductPriceException;

public class Main {
	
	public static void returnPolicy(Returnable r) {
		r.doReturn();
	}
	
	public static void print(Clothing c) {
		System.out.println(c);
		if(c instanceof Shirt) {
			returnPolicy((Returnable)c);
		}
	}
	
	public static void print(Footwear f) {
		System.out.println(f);
		if(f instanceof Flats) {
			returnPolicy((Returnable)f);
		}
	}

	public static void main(String[] args) {
	
		Clothing[] cloths= {
				new Shirt(1, "Levis-TShirt", 5, 10, 40),
				new CustomShirt(4,"Custom Shirt-Cust1",20,2),
				new Shirt(2, "US-POLO-shirt", 8, 10, 38),
				new CustomShirt(5,"Custom Shirt-Cust2",100,1),
				new Shirt(3, "Adidas-Denim", 15, 10, 44)
		};
		List<Clothing> clothList=new ArrayList<>(Arrays.asList(cloths));
		//clothList.add(new Shirt(6, "Armani", 105, 2, 32));
		Function<Clothing,Double> f=(c)-> c.getPrice();
		clothList.forEach(c->System.out.println(f.apply(c)));
		Footwear[] footwears= {
				new Flats(101, "C-1001", 10.21, 10),
				new Flats(102, "C-1002", 11.56, 5),
				new Boots(103,"B-1200",23.50,4,false),
				new Boots(104,"B-1201",23.50,4,true),
		};
		List<Footwear> footwearList=Arrays.asList(footwears);
		
//		try {
//		for(Clothing c:clothList) {
//			c.setPrice(c.getPrice()*-1.01);
//			print(c);
//		}
//		}catch(ProductPriceException px) {
//			System.err.println(px.getMessage());
//		}
//		System.out.println("\n*************Footwear************");
//		
//		for(Footwear f:footwearList) {
//			f.setPrice(f.getPrice()*1.01);
//			print(f);
//		}
//		//PaymentGateway pg=new PaymentGateway();
//		PaymentGateway pg=PaymentGateway.getInstance();
//		pg.setAmount(120);
//		pg.setCardNo("1200-9010-2010-2201");
//		PaymentGateway pg1=PaymentGateway.getInstance();
//		System.out.println(pg.hashCode());
//		System.out.println(pg1.hashCode());
	}
	

}
