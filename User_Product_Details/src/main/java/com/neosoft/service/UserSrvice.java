package com.neosoft.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.neosoft.dto.User;
import com.neosoft.enity.UserEntity;

@Service
public interface UserSrvice {

	UserEntity save(User user);

	Optional<UserEntity> findById(long id);

	UserEntity updateUser(Integer id, User user);

	void deleteById(Integer id);

}
