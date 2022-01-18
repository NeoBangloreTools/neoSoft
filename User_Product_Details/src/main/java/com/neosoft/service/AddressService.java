package com.neosoft.service;



import com.neosoft.dto.Address;
import com.neosoft.enity.AddressEntity;

public interface AddressService {

	AddressEntity save(Address address);

	AddressEntity updateUser(Integer id, Address address);

	void deleteById(Integer id);
	
	

}
