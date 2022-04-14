package com.example.demo_azure_devops;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @RequestMapping("/")
  public String index() {
    return "Hello from Spring Boot!";
  }
}
