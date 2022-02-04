package com.neosoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class SpringBootFeignClientProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFeignClientProjectApplication.class, args);
	}

}
