package com.gf.listingsql;

import com.gf.listingsql.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingsqlApplication implements CommandLineRunner {
  ToDoService service;

  @Autowired
  public ListingsqlApplication(ToDoService service) {
    this.service = service;
  }

  public static void main(String[] args) {
    SpringApplication.run(ListingsqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

  }
}

