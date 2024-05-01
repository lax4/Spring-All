package com.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	 @SuppressWarnings("resource")
 		ApplicationContext context = new AnnotationConfigApplicationContext(javaconfig.class);
         ProductBean pb= (ProductBean)context.getBean("getProduct");
         pb.printProduct();
       
    }
}
