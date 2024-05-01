package com.springfirst._First;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;




public class App 
{
    public static void main( String[] args )
    {
    	Resource res=new ClassPathResource("springconfig.xml");
        XmlBeanFactory factory=new XmlBeanFactory(res);
        Addition myBean=(Addition)factory.getBean("add");
        myBean.printAddition();
    }
}
