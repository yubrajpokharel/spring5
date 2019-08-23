package com.yubraj.spring5.demo.jms;

import lombok.Data;

@Data
public class FakeJmsBroker {
  public String url;
  public int Port;
  public String user;
  public String password;
}
