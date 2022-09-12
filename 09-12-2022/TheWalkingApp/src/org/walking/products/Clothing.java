package org.walking.products;

public abstract class Clothing {
	private int productId;
	private String desc;
	private double price;
	private int qtyInStock;
	
	public Clothing(int id, String desc, double price, int qty) {
			this.productId=id;
			this.desc=desc;
			this.price=price;
			this.qtyInStock=qty;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
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

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	public void print() {
		System.out.println(this.productId+":"+this.desc+":"+this.price);
	}
	
}
