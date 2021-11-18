package com.neo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.neo.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	
	@Query("UPDATE user SET isActive = 'N' WHERE userId = ?1")
	public void deleteUser(Integer userId);

	@Query("SELECT u FROM User u WHERE email = ?1 AND isActive = 'Y'")
	public User getUser(String userEmail);
	
	

}
