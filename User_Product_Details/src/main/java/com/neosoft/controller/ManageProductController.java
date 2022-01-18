package com.neosoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.dto.ManageProduct;
import com.neosoft.enity.ManageProductEntity;
import com.neosoft.service.ManageProductService;

@RestController
@RequestMapping("/manage")
public class ManageProductController {
	
	@Autowired
	private ManageProductService service;

	@PostMapping("/product")
	  public ResponseEntity< ManageProductEntity> createUser(@RequestBody ManageProduct manageproduct) {
	    try {
	    	 	
	    System.out.println("----->"+manageproduct);
	    	
	    	
	    ManageProductEntity mp=service.save(manageproduct);
	    
	      return new ResponseEntity<ManageProductEntity>(mp, HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	
	@PutMapping("/product/{id}")
	  public ResponseEntity<?> updateTutorial(@PathVariable("id") Integer id, @RequestBody ManageProduct manageproduct) {
		ManageProductEntity tutorialData = service.updateUser(id,manageproduct);

	    if(tutorialData!=null) {
	      return new ResponseEntity<>(tutorialData, HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	
	 @DeleteMapping("/del/{id}")
	  public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") Integer id) {
	    try {
	    	service.deleteById(id);
	      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    } catch (Exception e) {
	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }

}
