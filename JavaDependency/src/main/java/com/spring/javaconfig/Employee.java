package com.spring.javaconfig;

public class Employee {
	private int id ;
	private String name;
	private Address addres;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddres() {
		return addres;
	}
	public void setAddres(Address addres) {
		this.addres = addres;
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee(Address addres) {
		this.addres=addres;
	}
	public Employee() {
		
	}
	public void display() {
		System.out.println("Employee details:" +id +" " +name);
		System.out.println("Address:" +addres.getCity() +" " +addres.getColony() +" " +addres.getPincode());
	}
}
