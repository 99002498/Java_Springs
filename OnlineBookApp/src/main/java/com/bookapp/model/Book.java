package com.bookapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Getter
@Setter
public class Book {
	
	Integer bookId;
	String title;
	String category;
	String author;
	Double price;
	
	
	
	

}
