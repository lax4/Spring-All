package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext contex= new ClassPathXmlApplicationContext("springconfig.xml");
    	BeanClass stu=(BeanClass)contex.getBean("jdbcId3");
//    	stu.create();
//    	stu.insert();
//    	stu.delete();
//    	stu.update();
    	stu.getoneRecord();
    			
    }
}
