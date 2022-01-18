package com.neosoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.enity.ManageProductEntity;
@Repository
public interface ManageProductRepository extends JpaRepository<ManageProductEntity, Integer> {

	

}
