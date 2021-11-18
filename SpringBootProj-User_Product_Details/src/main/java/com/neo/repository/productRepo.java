package com.neo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neo.entity.Product;

public interface productRepo extends JpaRepository<Product, String> {

}
