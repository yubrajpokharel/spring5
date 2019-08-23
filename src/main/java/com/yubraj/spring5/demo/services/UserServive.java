package com.yubraj.spring5.demo.services;


import com.yubraj.spring5.demo.blueprint.User;
import com.yubraj.spring5.demo.dao.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServive {

  @Autowired
  private UserRepo userRepo;

  public List<User> getUsers(){
    return userRepo.getUsers();
  }
}
