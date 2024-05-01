package com.spring.javaconfig;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaconfig {
	@Bean
	public ProductBean getProduct() {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter product id:");
		int id=scan.nextInt();
		System.out.println("Enter product name:");
		String name=scan.next();
		System.out.println("Enter product quantity:");
		int quantity=scan.nextInt();
		System.out.println("Enter product price");
		double price=scan.nextDouble();
		
		ProductBean prod=new ProductBean(id,name,quantity,price);
		return prod;
		
		
		
		
		
	}
}
