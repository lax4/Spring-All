package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext contex= new ClassPathXmlApplicationContext("springconfig.xml");
    	Employee emp=(Employee)contex.getBean("EmpBean");
//    	emp.create();
//    	emp.insert();
//    	emp.delete();
    	
   	emp.getAll();
    }
}
