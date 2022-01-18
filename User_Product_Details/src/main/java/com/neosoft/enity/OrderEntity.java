package com.neosoft.enity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class OrderEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO  )
	private Integer orderId;
	private String orderNo;
	private Integer userId;
	private String orderTotal;
	private String totalQTY;
    private Timestamp createdAt;
	private String createdBy;
    private Timestamp modifiedAt;
	private String modifiedBy;

}
