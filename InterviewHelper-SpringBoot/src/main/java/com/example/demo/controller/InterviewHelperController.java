package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InterviewHelperController {
  @GetMapping("/")
	public String sayHello() {
	  return "home.html";
  } 
  
  @Controller
  public class Admin {
    @GetMapping("/admin")
  	public String sayHello() {
  	 return "home1.html";
    } 
  }
 
}
