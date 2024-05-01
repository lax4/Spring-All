package com.spring.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Collections {
	private List<String> empNames;
	private Set<Integer> empNums;
	private Map<String,Integer>empDepartNo;
	private Properties empSalary;
	
	public Collections (List<String> empNames,Set<Integer> empNums,Map<String, Integer> empDepartNo,Properties empSalary) {
		this.empNames = empNames;
		this.empNums = empNums;
		this.empDepartNo = empDepartNo;
		this.empSalary = empSalary;
		
	}
	
	public Properties getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Properties empSalary) {
		this.empSalary = empSalary;
	}

	public List<String> getEmpNames() {
		return empNames;
	}
	public void setEmpNames(List<String> empNames) {
		this.empNames = empNames;
	}
	public Set<Integer> getEmpNums() {
		return empNums;
	}
	public void setEmpNums(Set<Integer> empNums) {
		this.empNums = empNums;
	}
	public Map<String, Integer> getEmpDepartNo() {
		return empDepartNo;
	}
	public void setEmpDepartNo(Map<String, Integer> empDepartNo) {
		this.empDepartNo = empDepartNo;
	}
	public Collections() {
		
	}
	
	public void print() {
		for(String emp:empNames) {
			System.out.println(emp);
		}
		
	}
	
}
