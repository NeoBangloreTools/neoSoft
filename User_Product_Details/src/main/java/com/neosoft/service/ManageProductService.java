package com.neosoft.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.neosoft.dto.ManageProduct;
import com.neosoft.enity.ManageProductEntity;
@Service
public interface ManageProductService {

	ManageProductEntity save(ManageProduct manageproduct);

	List<ManageProductEntity> getAllProduct();

	ManageProductEntity updateUser(Integer id, ManageProduct manageproduct);

	void deleteById(Integer id);

	ManageProductEntity getAllProductBasedonAddress(Integer id);

}
