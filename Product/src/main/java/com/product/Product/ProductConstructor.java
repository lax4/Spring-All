package com.product.Product;

public class ProductConstructor {
	int pId;
	String pName;
	String pQuantity;
	double pPrice;
	public ProductConstructor(int id,String Name,String Quantity,double Price) {
		this.pId=id;
		 this.pName=Name;
		this.pQuantity=Quantity;
		this.pPrice=Price;
	}
		public void print() {
			
		System.out.println(pId);
		System.out.println(pName);
		System.out.println(pQuantity);
		System.out.println(pPrice);
	}
}
