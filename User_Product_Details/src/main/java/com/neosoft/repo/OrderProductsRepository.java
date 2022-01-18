package com.neosoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.enity.OrderproductsEntity;

public interface OrderProductsRepository extends JpaRepository<OrderproductsEntity, Integer> {

}
