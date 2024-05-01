package com.spring.javaconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
      
        @SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext("Javaconfig.class");
        StudentBean bc= (StudentBean)context.getBean("getBean");
        bc.display();
    }
}
