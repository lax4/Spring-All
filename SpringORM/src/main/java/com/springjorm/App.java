package com.springjorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjorm.dao.StudentDao;

import antlr.collections.List;


public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext contex= new ClassPathXmlApplicationContext("springconfig.xml");
    	StudentDao dao=(StudentDao)contex.getBean("stDao");
   	dao.toString();
    	
//	StudentBean std=new StudentBean();
//   	std.setId(110);
//    	std.setName("lakshmi");
//    	std.setCourse("javafullStack");
//    	dao.saveStudent(std);
//    StudentBean i=dao.viewStudentOne(10);
//    System.out.println(i);
   	
//     dao.deleteStudent(110);
//   List<StudentBean> st=dao.StudentAll();
//   	System.out.println(st);
   	StudentBean studentone=dao.viewStudentOne(110);
//   	studentone.setId(102);
   	studentone.setName("luck");
   	studentone.setCourse("spring");
   	dao.updateStudent(studentone);
   	System.out.println("updated successfully");
   	
   
    }

	
	
}
