package com.neosoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.models.User;
import com.neosoft.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	//get all user
	@GetMapping("/")
	public List<User>getAllUser(){	
		return userservice.getAllUser();
	}
	
	//get single user
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username")String username) {
		return this.userservice.getUser(username);	
	}
	@PostMapping("/")
	public User add(@RequestBody User user) {
	   return this.userservice.addUser(user);
	}	
	
	
	
	

}