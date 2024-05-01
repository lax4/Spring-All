package com.spring.javaconfig;

public class Address {
	private String city;
	private String colony;
	private int pincode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Address(String city, String colony, int pincode) {
		super();
		this.city = city;
		this.colony = colony;
		this.pincode = pincode;
	}
	public Address() {
		
	}
	
	
}
