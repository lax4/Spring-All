package com.springjorm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springjorm.StudentBean;

public class StudentDaoImpl implements StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	


	

	public StudentDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDaoImpl(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int saveStudent(StudentBean studentBean) {
		// TODO Auto-generated method stub
		int savedetails=(Integer)hibernateTemplate.save(studentBean);
		return savedetails;
	}

	@Override
	
	public StudentBean viewStudentOne(int id) {
		// TODO Auto-generated method 
	StudentBean std=hibernateTemplate.get(StudentBean.class,id);
		
		return std;
	}

	@Override
	@Transactional
	public void updateStudent(StudentBean studentBean) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(studentBean);
		
	}

	@Override
	@Transactional
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		StudentBean std=hibernateTemplate.get(StudentBean.class,id);
	if(std!=null) {
	hibernateTemplate.delete(std);
}
		
	}

	@Override
	public List<StudentBean> StudentAll() {
		// TODO Auto-generated method stub
		List<StudentBean> st=hibernateTemplate.loadAll(StudentBean.class);
		return st;
	}

	
 
}
