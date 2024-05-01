package com.product.Product1;

import com.product.Product1.interfacee.ProductImp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Product p = new Product(104,"Mobile","good",500);
      p.setId(104);
      p.setName("mobile");
      p.setQuantity("good");
      p.setPrice(500);
      
      System.out.println(p.getId());
      System.out.println(p.getName());
      System.out.println(p.getQuantity());
      System.out.println(p.getPrice());
      
      ProductImp p1=new ProductImp(105,"pen","good",5);
      p1.setId(105);
      
    }
    
}
