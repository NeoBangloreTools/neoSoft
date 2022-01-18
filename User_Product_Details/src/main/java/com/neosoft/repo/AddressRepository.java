package com.neosoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.neosoft.enity.AddressEntity;
@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Integer> {

	@Query(value="SELECT * FROM neosoft.address_entity where user_id=:id", nativeQuery = true)
	AddressEntity findbyuserid(Integer id);

}
