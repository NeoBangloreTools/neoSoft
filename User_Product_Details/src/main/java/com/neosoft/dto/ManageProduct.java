package com.neosoft.dto;

import lombok.Data;

@Data
public class ManageProduct {
	
	private String Productname;
	private String ProductSKU; 
	private double Price; 
	private boolean isActive;
	private String Qty;
	
}
