package com.spring.javaconfiguration;

public class StudentBean {
	private int id;
	private String name;
	private int batch;
	
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
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
	public StudentBean(int id, String name, int batch) {
		super();
		this.id = id;
		this.name = name;
		this.batch = batch;
	}
	public StudentBean() {
		
	}
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(batch);
	}
}
