package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.service.BookService;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class OnlineBookAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OnlineBookAppApplication.class, args);
	}
	@Autowired
	BookService bookService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		bookService.getAllBooks().forEach(System.out::println);
		System.out.println("---------------------------------");
		bookService.getByAuthor("Tech").forEach(System.out::println);
		System.out.println("---------------------------------");
		System.out.println(bookService.getById(1));
		System.out.println("---------------------------------");
		bookService.getByCategory("Kathy").forEach(System.out::println);
		System.out.println("---------------------------------");
	}

}
