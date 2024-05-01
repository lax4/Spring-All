package com.spring.four.Dependency;

public class Order {
	private int orderId;
	private Product Pro;

	public Order(int orderId,Product pro) {
		
		this.orderId = orderId;
		this.Pro=pro;
	}
	public Order(Product pro) {
		this.Pro=pro;
	}
	public Order() {
		
	}
	
	public Product getPro() {
		return Pro;
	}
	public void setPro(Product pro) {
		Pro = pro;
	}
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public void print() {
		System.out.println(orderId);
		System.out.println(Pro);
		System.out.println("product details:" +Pro.getProductId());
		System.out.println(Pro.getProductName());
		System.out.println(Pro.getPrice());
		System.out.println(Pro.getQuantity());
	}
}
