package com.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaconfig {

	@Bean("id1")
	public Employee getBean() {
		Employee bean = new Employee();
		bean.setId(1);
		bean.setName("lakshmi");

		Address ad = new Address();
		ad.setCity("rajam");
		ad.setColony("sunkari");
		ad.setPincode(6567);

		bean.setAddres(ad); // Set the Address property of the Employee bean

		return bean;
	}

}
