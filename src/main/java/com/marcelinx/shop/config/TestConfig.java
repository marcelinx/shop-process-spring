package com.marcelinx.shop.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.marcelinx.shop.entities.User;
import com.marcelinx.shop.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

  @Autowired
  private UserRepository userRepository;

  @Override
  public void run(String... args) throws Exception {

    User u1 = new User(null, "Joao", "joao@gmail.com", "1111", "12345");
    User u2 = new User(null, "Beatryz", "beatryz@gmail.com", "12345", "1111");

    userRepository.saveAll(Arrays.asList(u1, u2));
  }

}
