package com.neosoft.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.dto.Address;
import com.neosoft.enity.AddressEntity;
import com.neosoft.repo.AddressRepository;
@Service
public class AddressServiceImpl implements AddressService {
   
	@Autowired
	private AddressRepository repo;
	

	@Override
	public AddressEntity save(Address address) {
		AddressEntity a=new AddressEntity();
		a.setAddress1(address.getAddress1());
		a.setAddress2(address.getAddress2());
		a.setPincode(address.getPincode());
		a.setUserId(address.getUserId());
		a.setActive(true);
		a.setPrimary(true);
		a.setCreatedAt(new Timestamp(new Date().getTime()));
		a.setCreatedBy("Shivam");
		return repo.save(a);
		
	}


	@Override
	public AddressEntity updateUser(Integer id, Address address) {
		Optional<AddressEntity> op=repo.findById(id);
		AddressEntity a= op.get();
		 a.setAddress1(address.getAddress1());
		 a.setAddress2(address.getAddress2());
		 a.setPincode(address.getPincode());
		 a.setModifiedAt(new Timestamp(new Date().getTime()));
		 a.setModifiedBy("shivam");
		return repo.save(a);
	}


	@Override
	public void deleteById(Integer id) {
		repo.deleteById(id);
	}

}

