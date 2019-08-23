package com.yubraj.spring5.demo.dao;



import org.springframework.stereotype.Component;

import com.yubraj.spring5.demo.blueprint.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class UserRepo {

    List<User> users = new ArrayList<>();

    public UserRepo() {

      this.users = Arrays.asList(
          new User("sample", "user", "20"),
          new User("another", "user", "20"),
          new User("yet another", "user", "20"),
          new User("again yet another", "user", "20"));
    }

    public List<User>  getUsers(){
      return this.users;
    }

}
