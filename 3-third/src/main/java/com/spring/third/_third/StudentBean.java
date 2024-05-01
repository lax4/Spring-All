package com.spring.third._third;

public class StudentBean {
	private int id;
	private String name;
	private String course;
	private int batch;
	private String location;
	
	public StudentBean(int id,String name,String course,int batch,String location) {
		this.id=id;
		this.name=name;
		this.course=course;
		this.batch=batch;
		this.location=location;
	}
	public StudentBean() {
		
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setCourse(String course) {
		this.course=course;
	}
	public String getCourse() {
		return course;
	}
	public void setBatch(int batch) {
		this.batch=batch;
	}
	public int getBatch() {
		return batch;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public String getAmeerpet() {
		return location;
	}
	
public void print() {
	System.out.println(id);
	System.out.println(name);
	System.out.println(course);
	System.out.println(batch);
	System.out.println(location);
}
}

