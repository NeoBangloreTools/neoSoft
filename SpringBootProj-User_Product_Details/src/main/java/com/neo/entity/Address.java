package com.neo.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//import com.user.demo.entities.User;

@Entity
@Table(name="pp_address")
public class Address implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="add_id")
	private Integer addressId;
	@Column(name="add_1")
	private String address1;
	@Column(name="add_2")
	private String address2;
	@Column(name="pincode")
	private Integer pincode;
	@Column(name="is_active")
	private String isActive;
	@Column(name="is_primary")
	private String isPrimary;
	@Column(name="created_at")
	private String createdAt;
	@Column(name="created_by")
	private String createdBy;
	@Column(name="modified_at")
	private String modifiedAt;
	@Column(name="modified_by")
	private String modifiedBy;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
	private User user;

	public Address() {
		
	}
     //constructor
	public Address(Integer addressId, String address1, String address2, Integer pincode, String isActive,
			String isPrimary, String createdAt, String createdBy, String modifiedAt, String modifiedBy, User user) {
		super();
		this.addressId = addressId;
		this.address1 = address1;
		this.address2 = address2;
		this.pincode = pincode;
		this.isActive = isActive;
		this.isPrimary = isPrimary;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.modifiedAt = modifiedAt;
		this.modifiedBy = modifiedBy;
		this.user = user;
	}
	
	public Address(String address1, String address2, int pincode, String isActive, String isPrimary, String createdAt,
			String createdBy, String modifiedAt, String modifiedBy, User user) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.pincode = pincode;
		this.isActive = isActive;
		this.isPrimary = isPrimary;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.modifiedAt = modifiedAt;
		this.modifiedBy = modifiedBy;
		this.user = user;
		//this.user.setAddress((Set<Address>) this);
	}
	//Setter&Getter
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
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
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getIsPrimary() {
		return isPrimary;
	}
	public void setIsPrimary(String isPrimary) {
		this.isPrimary = isPrimary;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(String modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", address1=" + address1 + ", address2=" + address2 + ", pincode="
				+ pincode + ", isActive=" + isActive + ", isPrimary=" + isPrimary + ", createdAt=" + createdAt
				+ ", createdBy=" + createdBy + ", modifiedAt=" + modifiedAt + ", modifiedBy=" + modifiedBy + ", user="
				+ user + "]";
	}
	
}


	

