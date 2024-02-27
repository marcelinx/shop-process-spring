package com.marcelinx.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelinx.shop.entities.Category;

public interface CategoryRepository extends JpaRepository <Category, Long> {
  
}
