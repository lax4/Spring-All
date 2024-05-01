package com.spring.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	@Autowired
	private Model model;
	
//	@Autowired
	public Car(Model model) {
		this.model=model;
		System.out.println("this is constructor method");
		
	}
//	@Autowired
	public void setModel(Model model) {
		this.model=model;
		System.out.println("this is setter method");
	
	}
	public Model getModel() {
		return model;
	}
	public Car() {
		
	}
	public void carStarted() {
		if(model!=null) {
			model.startMethod();
		}
		else {
			System.out.println("no started");
		}
	}
}
