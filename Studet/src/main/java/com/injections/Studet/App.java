package com.injections.Studet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Marks m= new Marks();
       m.setS1(1);
       m.setS2(2);
       m.setS3(3);
       
       Student s=new Student(m);
       s.setStname("lakshmi");
       s.setSclass(2);
       
       s.setMark(m);

    		   
    	School sc=new School(s);	
    	sc.setScname("government");
    	sc.setStu(s);
    	
    	sc.print();
    	
    }
}
