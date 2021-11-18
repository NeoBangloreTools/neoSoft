package com.neo.service;

import com.neo.dto.ShowUserDTO;
import com.neo.dto.UpDateUserDTO;
import com.neo.dto.UserDetailsDTO;
//@Component
//@Service
public interface IUserService {
	public abstract void createUser(UserDetailsDTO user);
	
	void updateUser(UpDateUserDTO user);
	
	void deleteUser( Integer userId);
	
	ShowUserDTO getUser(String userEmail)throws Exception;

}
