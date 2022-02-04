package com.neosoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.client.UserClientInterface;
import com.neosoft.dto.Root;
import com.neosoft.service.IServiceUser;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserController {
	
	
	@Autowired
	private IServiceUser serviceUser;

	
	@Autowired
	private UserClientInterface userClientinterface;
	
	
	@GetMapping("/")
	public List<Root> getUserDeatils() {
		List<Root> r=	userClientinterface.getUser();
		return serviceUser.serviceCall(r);
		 
	}
	
	
}
