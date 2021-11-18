package com.neo.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.criteria.Order;

@Entity
@Table(name = "pp_user")
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Integer userId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "user_email")
	private String email;

	@Column(name = "user_mobile")
	private Long mobile;

	@Column(name = "is_active")
	private String isActive;

	@Column(name = "created_at")
	private String createdAt;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "modified_at")
	private String modifiedAt;

	@Column(name = "modified_by")
	private String modifiedBy;

	@OneToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id",referencedColumnName = "user_id")
	private Set<Address> address = new HashSet<>();

	//@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		//@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,targetEntity = Order.class,mappedBy = "user")
		//@JoinColumn(name = "order_id",referencedColumnName = "order_id")
		//private Set<Order> orders = new HashSet<>();
	
	public User() {
		
	}
	
    //constructor
	public User(Integer userId, String userName, String email, Long mobile, String isActive, String createdAt,
			String createdBy, String modifiedAt, String modifiedBy, Set<Address> address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.mobile = mobile;
		this.isActive = isActive;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.modifiedAt = modifiedAt;
		this.modifiedBy = modifiedBy;
		this.address = address;
	}
	
	public User(String username, String email, Long mobile, String isActive, String createdAt, String createdBy,
			String modifiedAt, String modifiedBy) {

		this.userName = username;
		this.email = email;
		this.mobile = mobile;
		this.isActive = isActive;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.modifiedAt = modifiedAt;
		this.modifiedBy = modifiedBy;
	}

	//setter&Getter
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

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
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

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	//toString
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", mobile=" + mobile
				+ ", isActive=" + isActive + ", createdAt=" + createdAt + ", createdBy=" + createdBy + ", modifiedAt="
				+ modifiedAt + ", modifiedBy=" + modifiedBy + ", address=" + address + "]";
	}
  	
}
