package com.bookapp.dao.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.bookapp.model.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, Integer  > {

	List<Book> findByAuthor(String author);
	List<Book> findByCategory(String Category);
	List<Book> findByTitleAndAuthor(String title,String author);
	@Query("from Book b where b.title=?1 and price>?2")
	List<Book> findBookByTitleAndPrice(String title,Double price);
	@Query("from Book b where b.title=?1 and author>?2")
	List<Book> findBookByTitleAndAuthor(String title,String author);
	
	
}
