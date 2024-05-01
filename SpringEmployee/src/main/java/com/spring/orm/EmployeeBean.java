package com.spring.orm;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeBean {
	@Id
private int empId;
private String empName;
private int deptno;
private double salary;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public EmployeeBean(int empId, String empName, int deptno, double salary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.deptno = deptno;
	this.salary = salary;
}
public EmployeeBean() {
	
}
@Override
public String toString() {
	return "EmployeeBean [empId=" + empId + ", empName=" + empName + ", deptno=" + deptno + ", salary=" + salary + "]";
}



}
