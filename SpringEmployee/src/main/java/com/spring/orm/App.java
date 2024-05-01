package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.EmployeeDao;

public class App 
{
    public static void main( String[] args )
    {

    	@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("springconfig.xml");
    	EmployeeDao dao =(EmployeeDao)context.getBean("empDao");
    	dao.toString();
 	
//    	EmployeeBean emp =new EmployeeBean();
//    	emp.setEmpId(104);
//    	emp.setEmpName("Arijit");
//   	emp.setDeptno(1);
//   	emp.setSalary(50000);
//    	dao.saveEmplyee(emp);
//    	
//    	
//    	emp.setEmpId(102);
//    	emp.setEmpName("Arijit");
//   	emp.setDeptno(1);
//   	emp.setSalary(50000);
//    	dao.saveEmplyee(emp);
//    	
//    	EmployeeBean getting=dao.viewEmployeeOne(104);
//    	System.out.println(getting);
    	
//    	dao.deleteEmployee(104);
    	
   
    	
    }
}
