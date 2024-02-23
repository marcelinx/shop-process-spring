package com.marcelinx.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelinx.shop.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {}
