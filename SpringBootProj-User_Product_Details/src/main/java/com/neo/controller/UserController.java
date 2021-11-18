package com.neo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.neo.dto.UserDetailsDTO;
import com.neo.service.IUserService;

//@CrossOrigin(origins = "*")

 @Controller
 public class UserController {
	@Autowired
	 IUserService userservice;
	
	@PostMapping("/User")
	public ResponseEntity<?> createUserNew(@RequestBody UserDetailsDTO userdetails){
		userservice.createUser(userdetails);
		return new ResponseEntity<>("Created", HttpStatus.CREATED);	
	}
	
	@DeleteMapping("/user")
	public ResponseEntity<?> deleteUser(@RequestParam Integer userId) {
	 userservice.deleteUser(userId);
		return new ResponseEntity<>("Deleted", HttpStatus.OK);

	}

}
