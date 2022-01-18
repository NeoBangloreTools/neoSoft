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

import com.neosoft.dto.Address;
import com.neosoft.enity.AddressEntity;
import com.neosoft.service.AddressService;

@RestController
@RequestMapping("/api/")
public class AddressController {
	@Autowired
	 private AddressService service;

	@PostMapping("/address")
	  public ResponseEntity< AddressEntity> createUser(@RequestBody Address address) {
	    try {
	    	
	    	
	    System.out.println("----->"+address);
	    	
	    	
	    AddressEntity a=service.save(address);
	    
	      return new ResponseEntity<>(a, HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	
	@PutMapping("/address/{id}")
	  public ResponseEntity<?> updateTutorial(@PathVariable("id") Integer id, @RequestBody Address address) {
		AddressEntity tutorialData = service.updateUser(id,address);

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
