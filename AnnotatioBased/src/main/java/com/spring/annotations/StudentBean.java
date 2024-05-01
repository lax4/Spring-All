package com.spring.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component		//it detect the beanclasess //
public class StudentBean {
	@Value("1")
	private int sId;
	@Value("Lakshmi")
	private String sName;
	@Value("javaFullStack")
	private String course;
	@Value("10")
	private int batch;
	
	
	public void setSId(int sId) {
		this.sId=sId;
	}
	public int getSId() {
		return sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
	public StudentBean(int sId, String sName, String course, int batch) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.course = course;
		this.batch = batch;
	}
	public StudentBean() {
		
	}
	public void display() {
		System.out.println("student id:" +sId);
		System.out.println("student name:" +sName);
		System.out.println("course:" +course);
		System.out.println("batch:" +10);
	}
}
