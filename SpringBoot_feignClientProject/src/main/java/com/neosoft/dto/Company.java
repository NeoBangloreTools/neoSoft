package com.neosoft.dto;

import lombok.Data;

@Data
public class Company {
	
	 private String name; private String street;
	    private String suite;
	    private String city;
	    private String zipcode;
	    private Geo geo;
	    private String catchPhrase;
	    private String bs;

}
