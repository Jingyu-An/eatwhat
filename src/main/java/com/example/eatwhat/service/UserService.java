package com.example.eatwhat.service;


import com.example.eatwhat.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
  
  @Autowired
  private UserRepository repo;
}
