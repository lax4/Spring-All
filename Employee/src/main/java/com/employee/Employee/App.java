package com.employee.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
//       EmployeeMethods e = new EmployeeMethods();
//       e.insert(101,"lakshmi");
//       e.print();
//      
//    	EmployeeConstructor e = new EmployeeConstructor(101,"Lucky","java");
//    	e.print();
    	EmployeeSetter e= new EmployeeSetter();
    	e.setEmpId(104);
    	e.setEmpName("Lakshmi");
    	e.setCourse("java");
    	
    	System.out.println(e.getEmpId());
    	System.out.println(e.getEmpName());
    	System.out.println(e.getCourse());
    	
    }
}
 