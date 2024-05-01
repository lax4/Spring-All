package com.product.Product1.interfacee;

public class ProductImp implements ProductInterface {
	int id;
	String name;
	String quantity;
	double price;
	public ProductImp(int id,String name,String quantity,double price) {
		this.id=id;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}
	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id=id;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	@Override
	public void setQuantity(String quantity) {
		// TODO Auto-generated method stub
		this.quantity=quantity;
	}

	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		this.price=price;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getQuantity() {
		// TODO Auto-generated method stub
		return quantity;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}
