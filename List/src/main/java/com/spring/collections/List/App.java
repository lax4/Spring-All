package com.spring.collections.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        AppliBeanCollection myBean=(AppliBeanCollection)context.getBean("institute");
        myBean.print();
    }
}
