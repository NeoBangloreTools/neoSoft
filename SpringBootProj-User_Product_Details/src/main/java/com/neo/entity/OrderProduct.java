package com.neo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="pp_Order_Product")
public class OrderProduct {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Order_Item_Id")
	private String orderItemId;
	
	@PrimaryKeyJoinColumn(name="order_id")
	private String orderId;
	
	@Column(name="product_price")
	private Float productPrice;
	
	@Column(name="product_qty")
	private String productQty;
	
	//@ManyToOne(fetch = FetchType.LAZY, optional = false)
    //@JoinColumn(name = "order_Id", nullable = false)
	//private Order order;

	//setter&getter
	public String getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductQty() {
		return productQty;
	}

	public void setProductQty(String productQty) {
		this.productQty = productQty;
	}

	@Override
	public String toString() {
		return "OrderProduct [orderItemId=" + orderItemId + ", orderId=" + orderId + ", productPrice=" + productPrice
				+ ", productQty=" + productQty + "]";
	}
	
	
	//@ManyToOne(targetEntity=Order.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	//@JoinColumn(name="Order",referencedColumnName="Order_Id")
	//private Order order;

	 
}
