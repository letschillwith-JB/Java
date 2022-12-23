package com.masai.dao;

import com.masai.exception.BookException;
import com.masai.models.Book;

public interface BookDAO {

	public String createNewBook(Book book);
	
	public Book getBookById(int bookId) throws BookException;
	
	public String deleteBookById(int bookId) throws BookException;
	
	public String updateBookById(int bookId) throws BookException;

}
