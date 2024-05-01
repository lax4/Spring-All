package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.EmployeeBean;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private HibernateTemplate hibernateTemplate;

	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	

	public EmployeeDaoImpl(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}
	public EmployeeDaoImpl() {
		
	}


	@Override
	@Transactional
	public int saveEmplyee(EmployeeBean employeeBean) {
		// TODO Auto-generated method stub
		int insertdetails= (Integer) hibernateTemplate.save(employeeBean);
		return insertdetails;
	}

	@Override
	public EmployeeBean viewEmployeeOne(int id) {
		// TODO Auto-generated method stub
		EmployeeBean employ= hibernateTemplate.get(EmployeeBean.class,id);
		return employ;
	}

	@Override
	public void updateStudent(EmployeeBean employeeBean) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(104);
		
		
	}
	@Transactional
	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		EmployeeBean emp=hibernateTemplate.get(EmployeeBean.class,id);
		if(emp!=null) {
			hibernateTemplate.delete(emp);
		}
	}

	@Override
	public List<EmployeeBean> EmployeeAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
