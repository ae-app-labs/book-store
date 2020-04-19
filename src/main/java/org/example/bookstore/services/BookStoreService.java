package org.example.bookstore.services;

import java.util.List;

import org.example.bookstore.models.Book;
import org.example.bookstore.repositories.BookStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookStoreService {

	@Autowired
	private BookStoreRepository repository;
	
	public List<Book> getAllBooks(){
		return repository.getAllBooks();
	}

	public Book addBook(Book book) {
		return repository.addBook(book);
	}
	
	public Book getBookById(String id) {
		return repository.getBookById(id);
	}
}
