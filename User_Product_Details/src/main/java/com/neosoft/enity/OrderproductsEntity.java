package com.neosoft.enity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class OrderproductsEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer orderItemId;
	private Integer orderId;
	private double prodcutPrice; 
	private String Productqty;
	

}
