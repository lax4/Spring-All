package com.spring.third._third;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        StudentBean myBean=(StudentBean)context.getBean("student");
        myBean.print();
       
    }
}
