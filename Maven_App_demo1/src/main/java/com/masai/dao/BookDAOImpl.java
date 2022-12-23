package com.masai.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.masai.exception.BookException;
import com.masai.models.Book;
import com.masai.utility.ProvideConnection;

import java.time.LocalDateTime;
import java.util.Scanner;

public class BookDAOImpl implements BookDAO{

	public String createNewBook(Book book) {
		EntityManager em =  ProvideConnection.getConnection();
		em.getTransaction().begin();
		em.persist(book);
		em.getTransaction().commit();
		em.close();
		return "Book created successfully";
	}

	public Book getBookById(int bookId) throws BookException {
		EntityManager em =  ProvideConnection.getConnection();
		Book book = em.find(Book.class, bookId);
		if(book!=null) return book;
		else throw new BookException("No book found with bookId: "+bookId);
	}

	public String deleteBookById(int bookId) throws BookException {
		EntityManager em = ProvideConnection.getConnection();
		Book book = em.find(Book.class,bookId);
		if(book != null){
			em.getTransaction().begin();
			em.remove(book);
			em.getTransaction().commit();
			em.close();
			return "Book with id: "+bookId+" removed successfully ...";
		}
		else throw new BookException("No book found with id "+bookId);
	}

	public String updateBookById(int bookId) throws BookException {
		EntityManager em = ProvideConnection.getConnection();
		Book book = em.find(Book.class,bookId);
		if(book!=null){
			em.getTransaction().begin();

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter new name of book");
			String name = sc.next();
			System.out.println("Enter new price");
			int price = sc.nextInt();

			book.setCreated_timestamp(LocalDateTime.now());
			book.setName(name);
			book.setPrice(price);

			em.persist(book);

			em.getTransaction().commit();
			em.close();
			return "Book updated successfully...";
		}else throw new BookException("No book found with id: "+bookId);
	}

}
