package com.spring.orm.dao;

import java.util.List;

import com.spring.orm.EmployeeBean;



public interface EmployeeDao {
	public int saveEmplyee(EmployeeBean employeeBean);
	public EmployeeBean viewEmployeeOne(int id);
	public void updateStudent(EmployeeBean employeeBean);
	public void deleteEmployee(int id);
	public List<EmployeeBean> EmployeeAll();
}
