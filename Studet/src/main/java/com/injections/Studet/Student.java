package com.injections.Studet;

public class Student {
	private String Stname;
	private  int Sclass;
	private  Marks mark;
	
	Student(Marks mark){
		this.mark=mark;
	}
		
	public void setStname(String name) {
		this.Stname=name;
	}
	public void setSclass(int clas) {
		this.Sclass=clas;
	}
	public String getStname() {
		return Stname;
	}
	public int getSclass() {
		return Sclass;
	}
	public void setMark(Marks mark) {
		this.mark=mark;
	}
	public Marks getMark() {
		return mark;
	}

}
