package com.neo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pp_product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Product_Id")
	private String productId;
	@Column(name="product_name")
	private String productName;
	@Column(name="product_SKU")
	private String productSKU;
	@Column(name="product_price")
	private Float price;
	@Column(name="product_isActive")
	private Boolean isActive;
	@Column(name="product_qty")
	private String quantity;
	@Column(name="product_createdAt")
	private Date ceratedAt;
	@Column(name="product_createdBy")
	private String createdBy;
	@Column(name="product_modifiedAt")
	private Date modifiedAt;
	@Column(name="product_modifiedBy")
	private String modifiedBy;
	
	//Setter&getter
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductSKU() {
		return productSKU;
	}

	public void setProductSKU(String productSKU) {
		this.productSKU = productSKU;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Date getCeratedAt() {
		return ceratedAt;
	}

	public void setCeratedAt(Date ceratedAt) {
		this.ceratedAt = ceratedAt;
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
		return "Product [productId=" + productId + ", productName=" + productName + ", productSKU=" + productSKU
				+ ", price=" + price + ", isActive=" + isActive + ", quantity=" + quantity + ", ceratedAt=" + ceratedAt
				+ ", createdBy=" + createdBy + ", modifiedAt=" + modifiedAt + ", modifiedBy=" + modifiedBy + "]";
	}
	
}
