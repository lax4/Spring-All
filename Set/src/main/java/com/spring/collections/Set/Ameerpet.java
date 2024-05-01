package com.spring.collections.Set;

import java.util.Set;

public class Ameerpet {
	
	public Ameerpet(Set<Integer> studentRollNumbers) {
		this.studentRollNumbers=studentRollNumbers;
	}
	
	private Set<Integer> studentRollNumbers;
	
	public void setStudentRollNumbers(Set<Integer> studentRollNumbers) {
		this.studentRollNumbers=studentRollNumbers;
	}
	public Set<Integer> getStudentRollNumbers(){
		return studentRollNumbers;
	}
	public Ameerpet() {
		
	}
	public void printStudentRollNumbers() {
		for(Integer student:studentRollNumbers) {
			System.out.println(student);
		}
	}
}
