package com.neo.dto;

import java.util.List;

import com.neo.entity.Address;

public class ShowUserDTO {
	private Integer userId;
	private String userName;
	private String email;
	private Long mobile;
	private List<Address>userAddress;
	
	public ShowUserDTO() {
		
	}
	//constructor
	public ShowUserDTO(Integer userId, String userName, String email, Long mobile, List<Address> userAddress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.mobile = mobile;
		this.userAddress = userAddress;
	}

	//Setter&Getter
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

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

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public List<Address> getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(List<Address> userAddress) {
		this.userAddress = userAddress;
	}

	//toString
	@Override
	public String toString() {
		return "ShowUserDTO [userId=" + userId + ", userName=" + userName + ", email=" + email + ", mobile=" + mobile
				+ ", userAddress=" + userAddress + "]";
	}
	
	
	
	
}
