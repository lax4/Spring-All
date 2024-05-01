package com.injections.DependencyInjection;

public class Product {
	
	private int pId;
	private String pName;
	private double price;
	private int quantity;
	
//	 Product(int id,String name,double price,int quantity){
//		this.pId=id;
//		this.pName=name;
//		this.price=price;
//		this.quantity=quantity;
//	 }
		public void setpId(int id) {
			this.pId=id;
		
		}
		public void setpName(String name) {
			this.pName=name;
		}
		public void setPrice(double price) {
			this.price=price;
		}
		public void setQuantity(int quantity) {
			this.quantity=quantity;
		}
		public int getpId() {
			return pId;
		}
		public String getpName() {
			return pName;
		}
		public int getQuantity() {
			return quantity;
		}
		public double getPrice() {
			return price;
		}
	}

