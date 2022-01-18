package com.neosoft.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.dto.ManageProduct;
import com.neosoft.enity.AddressEntity;
import com.neosoft.enity.ManageProductEntity;
import com.neosoft.enity.UserEntity;
import com.neosoft.repo.AddressRepository;
import com.neosoft.repo.ManageProductRepository;
import com.neosoft.repo.UserReposiory;

@Service
public class ManageProductServiceImpl implements ManageProductService {
	
	@Autowired
	ManageProductRepository repo;
	
	@Autowired
	private UserReposiory userrepo;
	
	@Autowired
	private AddressRepository addrRepository;
	

	@Override
	public ManageProductEntity save(ManageProduct manageproduct) {
		
		ManageProductEntity mp=new ManageProductEntity();
		mp.setProductname(manageproduct.getProductname());
		mp.setProductSKU(manageproduct.getProductSKU());
		mp.setPrice(manageproduct.getPrice());
		mp.setActive(true);
		mp.setQty(manageproduct.getQty());
		mp.setCreatedAt(new Timestamp(new Date().getTime()));
		mp.setCreatedBy("Shivam");
		return repo.save(mp);
		
	}

	@Override
	public ManageProductEntity updateUser(Integer id, ManageProduct manageproduct) {
		Optional<ManageProductEntity> op=repo.findById(id);
		ManageProductEntity mp= op.get();
		 mp.setProductSKU( manageproduct.getProductSKU());
		 mp.setPrice( manageproduct.getPrice());
		 mp.setQty( manageproduct.getQty());
		 mp.setModifiedAt(new Timestamp(new Date().getTime()));
		 mp.setModifiedBy("shivam");
		return repo.save(mp);
		
	}

	@Override
	public void deleteById(Integer id) {
		repo.deleteById(id);
		
	}
	
	@Override
	public List<ManageProductEntity> getAllProduct() {
		
		return repo.findAll();
	}

	@Override
	public ManageProductEntity getAllProductBasedonAddress(Integer id) {
	Optional<UserEntity> use=	userrepo.findById(1);
	UserEntity userentity=use.get();
	//System.out.println("=========>"+use.get());
	
	AddressEntity a=  addrRepository.findbyuserid(1);
	System.out.println("=========>"+a);
	Optional<ManageProductEntity> m=repo.findById(id);
	//	System.out.println("=========>"+m.get());
		return null;
	}	
	
}
