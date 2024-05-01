package com.spring.five._five;

public class AddressBean {
	
		private String houseNum;
		private String city;
		private String state;
		private String pincode;
		
		public AddressBean(String houseNum, String city, String state, String pincode) {
			super();
			this.houseNum = houseNum;
			this.city = city;
			this.state = state;
			this.pincode = pincode;
		}
		public  AddressBean() {
			
		}
		public String getHouseNum() {
			return houseNum;
		}
		public void setHouseNum(String houseNum) {
			this.houseNum = houseNum;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getPincode() {
			return pincode;
		}
		public void setPincode(String pincode) {
			this.pincode = pincode;
		}
	
		
	 }
	