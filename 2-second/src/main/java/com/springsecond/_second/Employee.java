package com.springsecond._second;

public class Employee {
	private String name;
	private int empId;
	private double salary;
	private int deptno;
	private int doj;
	
	public Employee(String name,int empid,double salary,int deptno,int doj) {
		this.name=name;
		this.empId=empid;
		this.salary=salary;
		this.deptno=deptno;
		this.doj=doj;
	}
	public Employee() {
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setEmpId(int empid) {
		this.empId=empid;
	}
	public int getEmpId() {
		return empId;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setDeptno( int deptno) {
		this.deptno=deptno;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDoj(int doj) {
		this.doj=doj;
	}
	public int getDoj() {
		return doj;
	}
	public void print() {
		System.out.println(name);
		System.out.println(empId);
		System.out.println(salary);
		System.out.println(deptno);
		System.out.println(doj);
		
	}
	
}
