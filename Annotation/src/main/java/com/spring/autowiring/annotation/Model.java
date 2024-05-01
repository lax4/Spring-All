package com.spring.autowiring.annotation;

public class Model {
	private int id;
	private String name;
	private String carModel;
	
	
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


	public String getCarModel() {
		return carModel;
	}


	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}


	public Model(int id, String name, String carModel) {
	
		this.id = id;
		this.name = name;
		this.carModel = carModel;
	}
	public Model() {
		
	}

	public void startMethod() {
		
		System.out.println("🚗 started");
	}
}
