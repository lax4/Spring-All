package com.springjdbc;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class BeanClass {
	private JdbcTemplate jdbcTemplate;
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public BeanClass(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public BeanClass() {
		
	}
	public void create() {
		jdbcTemplate.execute("create table student1(id number, name varchar2(20), course varchar2(20))");
		System.out.println("table created");
		
	}
	public void insert() {
		jdbcTemplate.update("insert into student1 values(101,'lucky','javafullstack')");
		jdbcTemplate.update("insert into student1 values(102,'lax','javafullstack')");
		System.out.println("inserted");
	}
	public void delete() {
		jdbcTemplate.update("delete from student1 where id='102' ");
		System.out.println("deleted");
	}
	public void update() {
		jdbcTemplate.update("update student1 set name='Arijit singh' where id='101' ");
		System.out.println("updated");
	}
	public void getoneRecord() {
		List<Map<String,Object>> oneRecord=jdbcTemplate.queryForList("select * from student1 where id ='101' ");
	
		Iterator<Map<String, Object>> it=oneRecord.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj.toString());
		}
	}
	
}
