package org.walking.products.misc;

import org.walking.products.Footwear;

public class Boots extends Footwear {
	private boolean _long;

	public Boots(int id, String desc, double price, int size, boolean _long) {
		super(id, desc, price, size);
		this._long=_long;
	}

	public boolean isLong() {
		return _long;
	}

	public void setLong(boolean _long) {
		this._long = _long;
	}

	@Override
	public void print() {
		super.print();
		if(isLong()) {
				System.out.println("This is long boot");
		}
	}
	

}
