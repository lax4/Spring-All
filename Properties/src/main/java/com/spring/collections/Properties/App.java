package com.spring.collections.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



 
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        AmeerpetTech myBean=(AmeerpetTech)context.getBean("institute");
        myBean.print();
    }
}
