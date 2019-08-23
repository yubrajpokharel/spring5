package com.yubraj.spring5.demo.test;

import static org.junit.Assert.assertEquals;

import com.yubraj.spring5.demo.external.ExternalPropsPropertySource;
import com.yubraj.spring5.demo.jms.FakeJmsBroker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExternalPropsPropertySource.class)
public class ExternalTest {

  @Autowired
  FakeJmsBroker fakeJmsBroker;

  @Test
  public void testFakeJmsBean() {
    assertEquals("yubrajpokharel.com", fakeJmsBroker.getUrl());
  }

}
