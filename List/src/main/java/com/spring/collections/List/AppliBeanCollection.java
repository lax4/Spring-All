package com.spring.collections.List;

import java.util.List;

public class AppliBeanCollection {
	 private List<String> studentNames;
	
	
	public AppliBeanCollection(List<String> studentNames) {
		
		this.studentNames = studentNames;
	}

	public List<String> getStudentNames() {
		return studentNames;
	}

	public void setStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
	}
	public AppliBeanCollection() {
		
	}
	public void print() {
		for(String student:studentNames) {
		System.out.println(student);
		}
	}
	
}
