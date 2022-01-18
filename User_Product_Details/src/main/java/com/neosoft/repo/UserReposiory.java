package com.neosoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.enity.UserEntity;

@Repository
public interface UserReposiory extends JpaRepository<UserEntity, Integer> {

}
