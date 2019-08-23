package com.yubraj.spring5.demo.external;

import com.yubraj.spring5.demo.jms.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:test.properties")
public class ExternalPropsPropertySource {

  @Autowired
  Environment environment;


  @Bean
  FakeJmsBroker fakeJmsBroker() {
    FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
    fakeJmsBroker.setUrl(environment.getRequiredProperty("yubraj.jms.url"));
    fakeJmsBroker.setPort(environment.getRequiredProperty("yubraj.jms.port", Integer.class));
    fakeJmsBroker.setUser(environment.getRequiredProperty("yubraj.jms.user"));
    fakeJmsBroker.setPassword(environment.getRequiredProperty("yubraj.jms.password"));
    return fakeJmsBroker;
  }

}
