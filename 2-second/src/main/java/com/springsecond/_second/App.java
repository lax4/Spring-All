package com.springsecond._second;

import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;



public class App 
{
    public static void main( String[] args )
    {
    	/*Resource res=new ClassPathResource("springconfig.xml");
        XmlBeanFactory factory=new XmlBeanFactory(res);
        Employee myBean=(Employee)factory.getBean("EmployeeDetails ");
        myBean.print();
        */
    	Resource res=new FileSystemResource(\"C:\\Users\\laxmi\\OneDrive\\Desktop\\FileSystem\\springconfig.xml.txt\");"
        XmlBeanFactory factory=new XmlBeanFactory(res);
        Employee myBean=(Employee)factory.getBean("EmployeeDetails ");
        myBean.print();
        
    }
}




