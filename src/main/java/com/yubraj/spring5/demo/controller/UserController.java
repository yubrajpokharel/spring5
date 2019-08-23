package com.yubraj.spring5.demo.controller;


import com.yubraj.spring5.demo.blueprint.User;
import com.yubraj.spring5.demo.services.UserServive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

  @Autowired
  UserServive userServive;

  @GetMapping(value = {"/users"}, produces = MediaType.APPLICATION_JSON_VALUE)
  public List<User> getUsers(){
    return userServive.getUsers();
  }

}
