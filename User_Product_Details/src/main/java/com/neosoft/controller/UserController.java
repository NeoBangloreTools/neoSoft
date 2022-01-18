package com.neosoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.dto.User;
import com.neosoft.enity.UserEntity;
import com.neosoft.service.UserSrvice;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserController {

	@Autowired
	private UserSrvice service;
	
	 @PostMapping("/user")
	  public ResponseEntity<UserEntity> createUser(@RequestBody User user) {
	    try {
	    	
	   log.info("----->"+user); 	
	   
	    	
	    	
	    UserEntity u=service.save(user);
	    
	      return new ResponseEntity<>(u, HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	 @PutMapping("/user/{id}")
	  public ResponseEntity<?> updateTutorial(@PathVariable("id") Integer id, @RequestBody User user) {
	  UserEntity tutorialData = service.updateUser(id,user);

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
