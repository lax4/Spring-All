package com.spring.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	
	@Autowired
	@Qualifier("model2")
	private Model model;
	
//	@Autowired
	public Car(Model model) {
		this.model=model;
		System.out.println("this is constructor method");
	}
//	@Autowired
	public void setModel(Model model) {
		this.model=model;
	
	}
	public Model getModel() {
		return model;
	}
	public Car() {
		
	}
	public void carStarted() {
		if(model!=null) {
			model.startMethod();
			System.out.println(model.getId() +" " +model.getName() +" " +model.getCarModel());
		}
		else {
			System.out.println("no started");
		}
	}
}
