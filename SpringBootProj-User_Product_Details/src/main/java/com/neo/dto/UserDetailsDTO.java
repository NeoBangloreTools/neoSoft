package com.neo.dto;

public class UserDetailsDTO {
	
	private String userName;
	private String email;
	private int mobile;
	private String address1;
	private String address2;
	private int pincode;
	
	//Setter&getter
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public UserDetailsDTO() {
		
	}
	
	//constructor
	public UserDetailsDTO(String userName, String email, int mobile, String address1, String address2, int pincode) {
		super();
		this.userName = userName;
		this.email = email;
		this.mobile = mobile;
		this.address1 = address1;
		this.address2 = address2;
		this.pincode = pincode;
	}
	//ToString
	@Override
	public String toString() {
		return "UserDTO [userName=" + userName + ", email=" + email + ", mobile=" + mobile + ", address1=" + address1
				+ ", address2=" + address2 + ", pincode=" + pincode + "]";
	}
	
}
