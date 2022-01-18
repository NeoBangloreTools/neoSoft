package com.neosoft.dto;

import lombok.Data;

@Data
public class Address {
	
	private String address1;
	private String address2;
	 private Integer userId;
	private String pincode;
	private boolean isActive;
	
}
