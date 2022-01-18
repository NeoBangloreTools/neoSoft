package com.neosoft.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.neosoft.models.User;

@Service
public class UserService {
	
	List<User> list=new ArrayList();
	
	public UserService() {
		list.add(new User("subham","subham123","subham123@gmail.com"));
		list.add(new User("rishabh","rishabh123","rishabh123@gmail.com"));
	}
	//get all user
	public List<User>getAllUser(){
		return this.list;			
	}
	
	//get single user
	public User getUser(String username) {
		return this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
				
	}
	
	//add new user
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}
	
 }   
	    