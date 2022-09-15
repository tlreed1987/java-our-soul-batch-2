package org.walking.products;

import org.walking.util.ProductPriceException;

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

	public void setPrice(double price) throws ProductPriceException {
		if(price>this.price) {
			this.price = price;
		}else {
			throw new ProductPriceException("New Price must be greater than current Price");
		}
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
	public String toString() {
		
		return(this.productId+":"+this.desc+":"+this.price);
	}
	
}
