package com.greenfoxacademy.hellobeanworldapp;

import com.greenfoxacademy.hellobeanworldapp.service.MyColor;
import com.greenfoxacademy.hellobeanworldapp.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldappApplication implements CommandLineRunner {

	@Autowired
	Printer p;

	@Autowired
	MyColor color;

	public static void main(String[] args) {
		SpringApplication.run(HellobeanworldappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
    p.log(color.printColor());
	}
}
