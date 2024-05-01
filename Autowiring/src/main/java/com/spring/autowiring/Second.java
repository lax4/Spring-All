package com.spring.autowiring;

public class Second {
	private int id;
	private String name;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("this is setter method");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Second(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("it  is called to constructor method");
	}
	
	public Second() {
		
	}
	
}
