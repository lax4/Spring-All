package com.spring.javaconfig;

public class ProductBean {
	private int productId;
	private String productName;
	private int quantity;
	private double price;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ProductBean(int productId, String productName, int quantity, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	
	public ProductBean() {
		
	}
	public void printProduct() {
		double total =price*quantity;
		System.out.println("total:" +total);
		double discount=0.0;
		if(total<3000) {
			discount=(total*10)/100;
		}
		else if(total>=3000 && total<10000) {
			discount=(total*15)/100;
		}
		else {
			discount=(total*20)/100;
			System.out.println("discount:" +discount);
			double invoice=total-discount;
			System.out.println("invoice:" +invoice);
		}
	}
}
