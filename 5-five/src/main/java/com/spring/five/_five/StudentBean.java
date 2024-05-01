package com.spring.five._five;

public class StudentBean {
	private int studentId;
	private String studentName;
	private AddressBean address;
	
	
	public StudentBean(int studentId, String studentName, AddressBean address) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
	}
	public StudentBean(AddressBean address) {
		this.address=address;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public AddressBean getAddress() {
		return address;
	}
	public void setAddress(AddressBean address) {
		this.address = address;
	}
	public StudentBean() {
		
	}
	public void print() {
		System.out.println("Student details :studentId:" +studentId);
		System.out.println("studentName:" +studentName);
		System.out.println(address);
	System.out.println(address.getHouseNum());
	System.out.println(address.getCity());
	System.out.println(address.getState());
	System.out.println(address.getPincode());
		
		
		
	}
}
