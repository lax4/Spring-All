package com.product.Product1;

public class Product {
	int id;
	String name;
	String quantity;
	double price;
	public Product(int id,String name,String quantity,double price) {
		this.id=id;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}
	public void setId(int Id) {
		this.id=Id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setQuantity(String quantity) {
		this.quantity=quantity;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
}
