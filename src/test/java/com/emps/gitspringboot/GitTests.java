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
    System.out.println("第三次");
    System.out.println("第四次");
    int a=20;
    System.out.println("第六次");
    int b=10;
     System.out.println("第五次");
     int c=40;
  }
}
