package com.injections.DependencyInjection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Product p = new Product(1,"1+mobile",4000,1);
    	Product p = new Product();
    	
        p.setpId(101);
        p.setpName("1+mobile");
        p.setPrice(4000);
        p.setQuantity(1);
        
//        System.out.println(p.getpId());
//        System.out.println(p.getpName());
//        System.out.println(p.getPrice());
//        System.out.println(p.getQuantity());
//        
        
        
//        Order o =new Order(1,"mobile",p);
        Order o = new Order(p);
        o.setorderId(105);
        o.setorderName("mobile");
        o.setProd(p);
        o.print();
        
    }
}
