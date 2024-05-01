package com.spring.javaconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Javaconfig {
	@Bean
	public StudentBean getBean() {
		StudentBean bean = new StudentBean();
		bean.setId(1);
		bean.setName("lakshmi");
		bean.setBatch(10);
		return bean;
		
	}
}
