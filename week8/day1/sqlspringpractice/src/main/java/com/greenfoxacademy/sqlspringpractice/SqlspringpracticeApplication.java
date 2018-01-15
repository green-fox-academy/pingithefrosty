package com.greenfoxacademy.sqlspringpractice;

import com.greenfoxacademy.sqlspringpractice.models.Todo;
import com.greenfoxacademy.sqlspringpractice.repositories.TodoRepository;
import javafx.application.Application;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SqlspringpracticeApplication {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(SqlspringpracticeApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(TodoRepository todoRepository) {
		return (String... args) -> {
			todoRepository.save(new Todo("Finish the first exercise"));
			todoRepository.save(new Todo("Learn stuff"));
			todoRepository.save(new Todo("Understand things"));
			todoRepository.save(new Todo("What?"));

			log.info("Found with findAll():");
			log.info("------------------");
			for (Todo todo : todoRepository.findAll()) {
				log.info(todo.toString());
			}
			log.info("");
		};
	}
}