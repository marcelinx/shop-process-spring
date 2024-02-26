package com.marcelinx.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelinx.shop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}