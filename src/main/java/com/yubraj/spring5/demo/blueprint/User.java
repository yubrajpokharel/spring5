package com.yubraj.spring5.demo.blueprint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
  public String firstName;
  public String lastName;
  public String age;
}
