package org.walking.products;

public class Footwear {
	private int Id;
	private String desc;
	private double price;
	private int size;
	public Footwear(int id, String desc, double price, int size) {
		Id = id;
		this.desc = desc;
		this.price = price;
		this.size = size;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public void print() {
		System.out.println(this.Id+":"+this.desc+":"+this.price);
	}
	
	public String toString() {
		return (this.Id+":"+this.desc+":"+this.price);
	}

}
