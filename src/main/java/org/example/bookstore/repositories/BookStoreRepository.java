package org.example.bookstore.repositories;

import java.util.ArrayList;
import java.util.List;

import org.example.bookstore.models.Book;
import org.springframework.stereotype.Repository;

@Repository
public class BookStoreRepository {

	private long id = 0;
	private Book NO_BOOK = new Book();
	private List<Book> books = new ArrayList<Book>();
	
	public List<Book> getAllBooks(){
		return new ArrayList<Book>(books);
	}

	public Book addBook(Book book) {
		book.setId( String.valueOf( ++id) );
		books.add(book);
		return book;
	}
	
	public Book getBookById(String id) {
		return books.stream()
			.filter( book -> book.getId().equals( id) )
			.findFirst()
			.orElseGet( () ->  NO_BOOK );
	}
	
	
}
