package com.spring.collections.Properties;

import java.util.Properties;
import java.util.Set;

public class AmeerpetTech {
	private Properties studentBatches;
	
	public AmeerpetTech(Properties studentBatches) {
		this.studentBatches=studentBatches;
	}
	public void setStudentBatches(Properties studentBatches) {
		this.studentBatches=studentBatches;
	}
	public Properties  getStudentBatches() {
		return studentBatches;
	}
	public AmeerpetTech() {
		
	}
	public void print() {
		Set<String>keys=studentBatches.stringPropertyNames();
				for(String key:keys) {
					System.out.println(key +":" +studentBatches.getProperty(key));
				}
	}
		
}
