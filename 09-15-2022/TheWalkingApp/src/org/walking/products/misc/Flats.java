package org.walking.products.misc;

import org.walking.products.Footwear;
import org.walking.products.Returnable;

public class Flats extends Footwear implements Returnable {

	public Flats(int id, String desc, double price, int size) {
		super(id, desc, price, size);
		
	}

	@Override
	public void doReturn() {
		System.out.println("Return-Policy:15 days return policy");
		
	}

}
