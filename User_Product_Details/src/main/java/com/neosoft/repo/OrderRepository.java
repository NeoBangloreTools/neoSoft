package com.neosoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.enity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {

}
