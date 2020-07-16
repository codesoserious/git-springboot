package com.emps.gitspringboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GitTests {


  @Test
  public void contextLoads() {
    System.out.println("第一次");
    System.out.println("第二次");
  }
}
