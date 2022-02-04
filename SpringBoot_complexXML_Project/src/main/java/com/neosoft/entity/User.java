package com.neosoft.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	private String username;
	private String email;
	
	private  List<Address> addres=new ArrayList<>();
	private List<Contact>contact=new ArrayList<>();
	

}
