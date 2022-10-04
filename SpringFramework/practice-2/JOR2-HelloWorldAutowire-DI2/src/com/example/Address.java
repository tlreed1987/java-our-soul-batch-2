package com.example;

import java.util.List;

public class Address {
	private String street;
	private String city;
	private List phone;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	public List getPhone() {
		return phone;
	}
	public void setPhone(List phone) {
		this.phone = phone;
	}
	
	
}
