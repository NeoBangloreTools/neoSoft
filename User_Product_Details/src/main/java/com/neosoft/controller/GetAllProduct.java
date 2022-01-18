package com.neosoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.enity.ManageProductEntity;
import com.neosoft.service.ManageProductService;

@RestController
@RequestMapping("/all/")
public class GetAllProduct {
	@Autowired
	private ManageProductService manageProductService;
	
	@GetMapping("/product")  
	private List<ManageProductEntity> getAllProduct()   
	{  
	return manageProductService.getAllProduct();  
	} 
	
	@GetMapping("/product/{id}")  
	private ManageProductEntity getAllProductDetails( @PathVariable ("id") Integer id)   
	{  	
		System.out.println("==>"+id);
		ManageProductEntity m= manageProductService.getAllProductBasedonAddress(id);
		 return m;
	} 
	
	

}
