package com.spring.autowiring;

public class First {
	private Second second;

	public Second getSecond() {
		return second;
	}

	public void setSecond(Second second) {
		this.second = second;
	}
	public  First(Second second) {
		this.second = second;
	}
	
	
	public First() {
		
	}
	
	
	public void print() {
		System.out.println("this is first bean");
		System.out.println("Second details:" +"Id:" +second.getId() +" " +"Name:" +second.getName() );
		
	}
}
