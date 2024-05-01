package com.product.Product;

public class ProductMethods {
	int pId;
	String pName;
	String pQuantity;
	double pPrice;
	public void insert(int id,String Name,String Quantity,double Price) {
		pId=id;
		pName=Name;
		pQuantity=Quantity;
		pPrice=Price;
	}
		public void print(){
			System.out.println(pId);
			System.out.println(	pName);
			System.out.println(pQuantity);
			System.out.println(pPrice);
	
	}
}
