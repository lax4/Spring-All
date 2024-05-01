package com.employee.Employee;

public class EmployeeConstructor {
	int empId;
	String empName;
	String empCourse;
	public EmployeeConstructor(int Id, String Name,String Course) {
		this.empId=Id;
		this.empName=Name;
		this.empCourse=Course;
	}
	public void print() {
		System.out.println("EmpId:" +empId);
		System.out.println("EmpName:" +empName);
		System.out.println("EmpCourse:" +empCourse);
	}
	
} 
