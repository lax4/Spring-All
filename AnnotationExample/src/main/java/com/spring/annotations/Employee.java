package com.spring.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("574")
	private int  empId;
	@Value("Lucky")
	private String empName;
	@Value("50000")
	private double salary;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee(int empId,String empName,double salary) {
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	public Employee() {
		
	}
	public void display() {
		System.out.println("Employee Id:" +empId);
		System.out.println("Employee Name:" +empName);
		System.out.println("Employee salary:" +salary);
	}
}
