package com.spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration 
@ComponentScan("com.spring.annotations")
public class App 
{
    public static void main( String[] args )
    {
    	
  		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);//spring container//
          StudentBean sb= (StudentBean)context.getBean(StudentBean.class);
          sb.display();
    }
}
