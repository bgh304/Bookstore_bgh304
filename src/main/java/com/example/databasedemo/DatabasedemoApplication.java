package com.example.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.databasedemo.domain.Book;
import com.example.databasedemo.domain.BookRepository;

import com.example.databasedemo.DatabasedemoApplication;

@SpringBootApplication
public class DatabasedemoApplication {
	private static final Logger log = LoggerFactory.getLogger(DatabasedemoApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DatabasedemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookRepository repository) {
		return (args) -> {
			Book b1 = new Book("Book1", "Author1", "2020", "123", "20€");
			Book b2 = new Book("Book2", "Author2", "2019", "456", "20€");
			
			repository.save(b1);
			repository.save(b2);
			
			log.info("add books");
			
			log.info("fetch books");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}
		};
	}
}
