package com.injections.Studet;

public class School {
	private String Scname;
	private Student stu;
	
		 
	School(Student stu){
		this.stu=stu;
		
	}
	
	
	void print() {
		System.out.println("School details" +Scname);
		
		System.out.println("student details" +stu.getStname() +" " +stu.getSclass());
		System.out.println("marks" +stu.getS1().getS2().getS3());
	}
	
	public void setScname(String name) {
		this.Scname=name;
	}
	public String getScname() {
		return Scname;
	}
	public void setStu(Student stu) {
		this.stu=stu; 
	}
	public Student getStu() {
		return stu;
	}
}

