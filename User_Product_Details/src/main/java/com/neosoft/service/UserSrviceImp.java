package com.neosoft.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.dto.User;
import com.neosoft.enity.UserEntity;
import com.neosoft.repo.UserReposiory;

@Service
public class UserSrviceImp implements UserSrvice {

	@Autowired
	private UserReposiory repo;
	@Override
	public UserEntity save(User user) {
		UserEntity u=new UserEntity();
		 u.setUsername(user.getUsername());
		 u.setEmail(user.getEmail());
		 u.setMobile(user.getMobile());
		 u.setActive(true);
		 u.setCreatedAt(new Timestamp(new Date().getTime()));
		 u.setCreatedBy("Shivam");
		u= repo.save(u);
		return u;
	}
	@Override
	public Optional<UserEntity> findById(long id) {
		
		return null;
	}
	@Override
	public UserEntity updateUser(Integer id, User user) {
		Optional<UserEntity> op=repo.findById(id);
		UserEntity u= op.get();
		 u.setUsername(user.getUsername());
		 u.setEmail(user.getEmail());
		 u.setMobile(user.getMobile());
		 u.setModifiedAt(new Timestamp(new Date().getTime()));
		 u.setModifiedBy("shivam");
		return repo.save(u);
	}
	@Override
	public void deleteById(Integer id) {
		repo.deleteById(id);
		
	}

	
	
	
	
	
}
