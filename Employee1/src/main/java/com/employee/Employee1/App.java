package com.employee.Employee1;

import com.employee.Employee1.interfacee.EmployeeImp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Employee e = new Employee("lakshmi" ,21,90000);
       
       e.setName("lakshmi");
       e.setAge(21);
       e.setSalary(90000);
       
       System.out.println(e.getName());
       System.out.println(e.getAge());
       System.out.println(e.getSalary());
       
       EmployeeImp e1 = new EmployeeImp("lakshmi",21,50000);
       
       e1.setName("lucky");
       e1.setAge(21);
       e1.setSalary(50000);
       
       System.out.println(e1.getName());
       System.out.println(e1.getAge());
       System.out.println(e1.getSalary());
       
    }
}
       
    

