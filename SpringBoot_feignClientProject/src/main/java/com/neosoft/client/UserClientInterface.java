package com.neosoft.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.neosoft.dto.Root;

@FeignClient(url="https://jsonplaceholder.typicode.com/users",name="USER-CLIENT")
public interface UserClientInterface {
	
	@GetMapping("/")
	public List<Root>getUser();
    
}
