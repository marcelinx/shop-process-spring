package com.marcelinx.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelinx.shop.entities.Product;

public interface ProductRepository extends JpaRepository <Product, Long> {
  
}
