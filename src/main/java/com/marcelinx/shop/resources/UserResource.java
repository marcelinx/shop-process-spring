package com.marcelinx.shop.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcelinx.shop.entities.User;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

  @GetMapping
  public ResponseEntity<User> findAll() {
    User u1 = new User(1L, "Maria", "maria@gmail.com", "1111", "12345");

    return ResponseEntity.ok().body(u1);
  }
}
