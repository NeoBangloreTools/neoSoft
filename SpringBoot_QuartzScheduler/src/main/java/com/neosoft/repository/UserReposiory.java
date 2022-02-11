package com.neosoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.entity.UserEntity;

@Repository
public interface UserReposiory extends JpaRepository<UserEntity, Integer> {

}
