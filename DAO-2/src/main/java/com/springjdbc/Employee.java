package com.springjdbc;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	private int deptNo;
	private JdbcTemplate jt;
	
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public JdbcTemplate getJt() {
		return jt;
	}
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	public Employee(int empId,String empName,double empSalary,int deptNo,JdbcTemplate jt) {
		this.empId=empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.deptNo = deptNo;
		this.jt = jt;
	}
	public Employee() {
		
	}
	public void create() {
		jt.execute("create table employee(id number,name varchar2(20),salary double,deptNo number)");
		System.out.println("table created");
	}
	public void insert() {
		jt.update("insert into employee values(104,'lakshmi',70000,4 )");
		jt.update("insert into employee values(105,'lucky',80000,5 )");
		jt.update("insert into employee values(106,'Arijit',90000,6) ");
		System.out.println("inserted");
	}
	public void delete() {
		jt.update("delete from employee where id='101' ");
		System.out.println("deleted");
	}
	public void getAll() {
	List<Map<String, Object>> allRecords =jt.queryForList("select * from employee");
	Iterator<Map<String, Object>>  it=allRecords.iterator();
	while(it.hasNext()) {
		Object obj=it.next();
		System.out.println(obj.toString());
		
	}
	
	}
}
