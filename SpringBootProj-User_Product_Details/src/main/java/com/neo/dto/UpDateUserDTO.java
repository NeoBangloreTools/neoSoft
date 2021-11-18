package com.neo.dto;

public class UpDateUserDTO {
	
	private Integer userId;
	private String userName;
	private String email;
	private Long mobile;

	private Integer addressId;
	private String address1;
	private String address2;
	private Integer pincode;
	
	private boolean setAsPrimaryAddress;
	private boolean updateAddress;
	private Integer addressIdToBeRemoved;
	private boolean userDataChanged;
	
	
	public UpDateUserDTO() {
		
	}


	//constructor
	public UpDateUserDTO(Integer userId, String userName, String email, Long mobile, Integer addressId, String address1,
			String address2, Integer pincode, boolean setAsPrimaryAddress, boolean updateAddress,
			Integer addressIdToBeRemoved, boolean userDataChanged) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.mobile = mobile;
		this.addressId = addressId;
		this.address1 = address1;
		this.address2 = address2;
		this.pincode = pincode;
		this.setAsPrimaryAddress = setAsPrimaryAddress;
		this.updateAddress = updateAddress;
		this.addressIdToBeRemoved = addressIdToBeRemoved;
		this.userDataChanged = userDataChanged;
	}


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


	public boolean isSetAsPrimaryAddress() {
		return setAsPrimaryAddress;
	}


	public void setSetAsPrimaryAddress(boolean setAsPrimaryAddress) {
		this.setAsPrimaryAddress = setAsPrimaryAddress;
	}


	public boolean isUpdateAddress() {
		return updateAddress;
	}


	public void setUpdateAddress(boolean updateAddress) {
		this.updateAddress = updateAddress;
	}


	public Integer getAddressIdToBeRemoved() {
		return addressIdToBeRemoved;
	}


	public void setAddressIdToBeRemoved(Integer addressIdToBeRemoved) {
		this.addressIdToBeRemoved = addressIdToBeRemoved;
	}


	public boolean isUserDataChanged() {
		return userDataChanged;
	}


	public void setUserDataChanged(boolean userDataChanged) {
		this.userDataChanged = userDataChanged;
	}


	@Override
	public String toString() {
		return "UpDateUserDTO [userId=" + userId + ", userName=" + userName + ", email=" + email + ", mobile=" + mobile
				+ ", addressId=" + addressId + ", address1=" + address1 + ", address2=" + address2 + ", pincode="
				+ pincode + ", setAsPrimaryAddress=" + setAsPrimaryAddress + ", updateAddress=" + updateAddress
				+ ", addressIdToBeRemoved=" + addressIdToBeRemoved + ", userDataChanged=" + userDataChanged + "]";
	}

}
