package com.spring.collections;

import java.util.Map;

public class AmeerpetBean {
	private Map<String,String> studentCourses;

	public Map<String, String> getStudentCourses() {
		return studentCourses;
	}

	public void setStudentCourses(Map<String, String> studentCourses) {
		this.studentCourses = studentCourses;
	}
	
	public AmeerpetBean(Map<String, String> studentCourses) {
		this.studentCourses = studentCourses;
	}
	public AmeerpetBean () {
		
	}
	public void print() {
		
			System.out.println(studentCourses);
		
	}
}
