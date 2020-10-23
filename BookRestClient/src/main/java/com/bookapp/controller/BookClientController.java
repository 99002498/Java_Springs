package com.bookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bookapp.model.Book;
@RequestMapping("/client-api")
@RestController

public class BookClientController {
	@Autowired
	RestTemplate restTemplate;
	static final String BASEURL ="http://localhost:8080/book-api";

	@GetMapping("/client-books")
	public List<Book> showAllBooks(){
		String url=BASEURL+"/books";
		List<Book> bookList=restTemplate.getForObject(url, List.class);
		return bookList;
		//return bookservice.getAllBooks();
	}
	
	@GetMapping("/client-books/by-author/{author}")
	public List<Book> showBooksByAuthor(@PathVariable("author")String author){
		String url=BASEURL+"/books-by-author"+author;
		List<Book> bookList=restTemplate.getForObject(url, List.class);
		return bookList;
		
		//return bookservice.getByAuthor(author);
	}
	
	@GetMapping("/client-books/by-category/{category}")
	public List<Book> showBooksByCategory(@RequestParam("category")String category){
		String url=BASEURL+"/books-by-category?category="+category;
		List<Book> bookList=restTemplate.getForObject(url, List.class);
		return bookList;
		//return bookservice.getByCategory(category);
	}
	@GetMapping("/client-books/by-Id/{bookid}")
	public Book showBooksById(@PathVariable("bookId")int id){
		String url=BASEURL+"/books-by Id";
		Book book=restTemplate.getForObject(url, Book.class);
		return book;
		//return bookservice.getById(id);
	}
}
