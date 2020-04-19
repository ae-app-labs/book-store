package org.example.bookstore.controllers;

import java.util.List;

import org.example.bookstore.models.Book;
import org.example.bookstore.services.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookStoreController {

	@Autowired
	private BookStoreService service;
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return service.getAllBooks();
	}
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		return service.addBook(book);
	}
	
	@GetMapping("/books/{id}")
	public Book getBookById(@PathVariable String id) {
		return service.getBookById(id);
	}
}
