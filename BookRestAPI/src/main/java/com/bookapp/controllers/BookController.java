package com.bookapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.model.Book;
import com.bookapp.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bookservice;
	@GetMapping("/books")
	public List<Book> showAllBooks(){
		return bookservice.getAllBooks();
	}
	
	@GetMapping("/books-by-author/{author}")
	public List<Book> showBooksByAuthor(@PathVariable("author")String author){
		return bookservice.getByAuthor(author);
	}
	
	@GetMapping("/books-by-category/{category}")
	public List<Book> showBooksByCategory(@PathVariable("category")String category){
		return bookservice.getByCategory(category);
	}
	@GetMapping("/books-by-Id/{bookid}")
	public Book showBooksById(@PathVariable("bookId")int id){
		return bookservice.getById(id);
	}



}
