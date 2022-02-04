package com.neosoft.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.entity.Address;
import com.neosoft.entity.Contact;
import com.neosoft.entity.User;

@RestController
@RequestMapping("/json")
public class UserController {

	@GetMapping(value="/user",produces= {MediaType.APPLICATION_XML_VALUE})
	public User user() {
		return item();
		
	}
	
	@GetMapping(value="/userJson",produces=MediaType.APPLICATION_JSON_VALUE)
	public User userJson() {
		return item();
		
	}
	
	
	private User item() {
		User user=new User();
		user.setUsername("subham");
		user.setEmail("subham123@gmail.com");
		user.getContact().add(new Contact("8984157929","9337600567"));
		user.getAddres().add(new Address("new market","755019","vasayanaga","jajpur road","jajpur"));
		user.getAddres().add(new Address("mumbai","755012","vasayanaga","marinDrive","maharasthara"));
		user.getAddres().add(new Address("new market","755015","hyd","jubuli hills","abcd"));
		return user;
		
		
	
		
	}
}
