package com.bookapp.dao;

import java.util.List;

import com.bookapp.model.Book;

//it has to connect to database
public interface BookDAO {
	
	List<Book> getAllBooks();
	List<Book> getByAuthor(String author);
	List<Book> getByCategory(String category);
	Book getById(int id);     //this will return only 1 book
	

}
