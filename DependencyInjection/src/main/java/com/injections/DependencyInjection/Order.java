package com.injections.DependencyInjection;

public class Order {
	private int orderId;
	private String orderName;
	private Product Prod;
	
//	Order(int Oid, String Oname,Product prod){
//		this.orderId=Oid;
//		this.orderName=Oname;
//		this.Product=prod;
//	}
	Order(Product prod){
		this.Prod=prod;
	}
	void print() {
		System.out.println(orderId);
		System.out.println(orderName);
		System.out.println(Prod);
		System.out.println(Prod.getpId() +" " +Prod.getpName() +" " +Prod.getPrice() +" " +Prod.getQuantity());
	}
	
	public void setorderId(int id) {
		this.orderId=id;
	}
	public void setorderName(String name) {
		this.orderName=name;
	}
	public int getorderId() {
		return orderId;
	}
	public String getorderName() {
		return orderName;
	}
	public void setProd(Product Prod) {
		this.Prod=Prod;
	}
	public Product getProd() {
		return Prod;
	}
}
