package com.bookapp.service;

import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

public interface BookService {

	Book addBook(Book book);
	boolean deleteBook(Integer bookid) throws BookNotFoundException;
	Book getBookById(Integer bookid) throws BookNotFoundException;
	Book updateBook(Book book);
	
	List<Book> getAllBooks();
	List<Book> getByAuthor(String author);
	List<Book> getByCategory(String category);
	Book getById(int id);     //this will return only 1 book
	List<Book> findBookByTitleAndPrice(String title,Double price);
	List<Book> findBookByTitleAndAuthor(String title,String author);
}
