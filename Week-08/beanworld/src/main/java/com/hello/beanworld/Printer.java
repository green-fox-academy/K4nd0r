package com.hello.beanworld;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {


  public static void log(String message) {
    System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
  }
}
