package com.bookapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bookapp.model.Book;
@Service
public class BookDAOImpl implements BookDAO{

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
	return showBookList();
	}

	@Override
	public List<Book> getByAuthor(String author) {
		List<Book> newBookList = new ArrayList<>();
		for(Book book: showBookList()) {
			if(book.getAuthor().equals(author))
				newBookList.add(book);
		}
		return newBookList;
	}

	@Override
	public List<Book> getByCategory(String category) {
		// TODO Auto-generated method stub
		List<Book> newBookList = new ArrayList<>();
		for(Book book: showBookList()) {
			if(book.getAuthor().equals(category))
				newBookList.add(book);
		}
		return newBookList;
	}

	@Override
	public Book getById(int id) {
		// TODO Auto-generated method stub
		for(Book book: showBookList()) {
			if(book.getBookId()==id)
				return book;
		}
		return null;
	}
	private List<Book> showBookList(){
		return Arrays.asList(
				new Book(1,"Learn Java","Kathy","Tech",900.0),
			    new Book(2,"7 habbits ","Steve","harri",800.0),
				new Book(3,"Geetha","Henry","posch",700.0),
				new Book(4,"Hobbits","Josh","Tarris",980.0));
	}

}
