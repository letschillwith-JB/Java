package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.masai.models.Book;
import com.masai.repository.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository brepo;
	
	@PostMapping("book")
	public Book createBook(@RequestBody Book book) {
		return brepo.save(book);
	}
}
