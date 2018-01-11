package com.greenfoxacademy.hellobeanworldapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldappApplication implements CommandLineRunner {

	@Autowired
  Printer p;

	public static void main(String[] args) {
		SpringApplication.run(HellobeanworldappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
    p.log("How cool is that?");
	}
}
