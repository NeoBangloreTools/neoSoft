package com.neosoft.dto;

import lombok.Data;

@Data
public class Order {
	
	private String orderNo;
	private Integer userId;
	private String orderTotal;
	private String totalQTY;
	
	
}
