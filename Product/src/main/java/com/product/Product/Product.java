package com.product.Product;

public class Product {
	int pId;
	String pName;
	String pQuantity;
	double pPrice;
	public void main(String args[]) {
		Product p = new Product();
		p.pId=158;
		p.pName="blutooth";
		p.pQuantity="good";
		p.pPrice=1600;
		System.out.println(p.pId +" " +p.pName +" " +p.pQuantity +" " +p.pPrice) ;
		
	}
}

