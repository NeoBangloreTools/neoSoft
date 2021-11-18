package com.neo.entity;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pp_order")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="order_id")
	private String orderId;
	
	@Column(name="oredr_no")
	private Integer orderNo;
	
	@Column(name="order_total")
	private String orderTotal;
	
	@Column(name="total_qty")
	private String totalQty;
	
	@Column(name="created_at")
	private Date createdAt;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="modified_at")
	private Date modifiedAt;
	
	@Column(name="modified_by")
	private String modifiedBy;
	

	//@ManyToOne(fetch = FetchType.LAZY, optional = false)
    //@JoinColumn(name = "user_id", nullable = false)
	//private User user;
	
	//@OneToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@JoinColumn(name = "orderitem_id",referencedColumnName = "orderitem_id")
	//private Set<OrderProduct> orderproduct = new HashSet<>();

	//Setter&Getter

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(String orderTotal) {
		this.orderTotal = orderTotal;
	}

	public String getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(String totalQty) {
		this.totalQty = totalQty;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	//ToString
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderNo=" + orderNo + ", orderTotal=" + orderTotal + ", totalQty="
				+ totalQty + ", createdAt=" + createdAt + ", createdBy=" + createdBy + ", modifiedAt=" + modifiedAt
				+ ", modifiedBy=" + modifiedBy + "]";
	}
	
	
}
