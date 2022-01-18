package com.neosoft.enity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ManageProductEntity {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer ProductId;
	private String Productname;
	private String ProductSKU; 
	private double Price; 
	private boolean isActive;
	private String Qty;
    private Timestamp createdAt;
	private String createdBy;
    private Timestamp modifiedAt;
	private String modifiedBy;
	
}
