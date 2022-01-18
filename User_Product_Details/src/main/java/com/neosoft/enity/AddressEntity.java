package com.neosoft.enity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class AddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressid;
	private String address1;
	private String address2;
	private String pincode;
	private Integer userId;
	
	private boolean isActive;
	private boolean isPrimary;
	
	private Timestamp createdAt;
	
	private String createdBy;
	
    private Timestamp modifiedAt;
	
	private String modifiedBy;

	
}
