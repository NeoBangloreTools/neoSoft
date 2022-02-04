package com.neosoft.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	
   private String Street;
   private String Pincode;
   private String  Area;
   private String   City;
   private String District;

}
