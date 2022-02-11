package com.neosoft.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="SONU_DB")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userid;
	private String username;
	private String email;
	private String Mobile;
	
	private boolean isActive;
	private Timestamp createdAt;
	
	private String createdBy;
	
    private Timestamp modifiedAt;
	
	private String modifiedBy;
	
	
}
