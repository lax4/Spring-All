package com.product.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ProductMethods p = new ProductMethods();
//        p.insert(101,"bluetooth","good",1700);
//        p.print();
    	
    	 ProductConstructor p = new ProductConstructor(101,"bluetooth","good",1800);
    	 p.print();
    }
}
