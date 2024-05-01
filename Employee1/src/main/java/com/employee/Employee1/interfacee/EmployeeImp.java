package com.employee.Employee1.interfacee;

public class EmployeeImp implements EmployeeInterface {
	private String name;
	private int age;
	private double salary;
	

public EmployeeImp(String name,int age, double salary) {
	this.name=name;
	this.age=age;
	this.salary=salary;
}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
			this.name=name;

	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.age=age;
	}

	@Override
	public void setSalary(double salary) {
		// TODO Auto-generated method stub
		this.salary=salary;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	
}
