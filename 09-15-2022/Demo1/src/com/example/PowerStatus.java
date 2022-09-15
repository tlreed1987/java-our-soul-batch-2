package com.example;
public enum PowerStatus {
	OFF("System is turned off"),
	ON("System is turned on"),
	SLEEP("System is in sleep mode");
	private String desc;
	private PowerStatus(String s) {
		this.desc=s;
		
	}
	
	public String getDesc() {
		return desc;
	}
}
