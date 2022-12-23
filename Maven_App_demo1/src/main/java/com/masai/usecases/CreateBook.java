package com.masai.usecases;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.masai.dao.BookDAOImpl;
import com.masai.models.Book;

public class CreateBook {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book book = new Book();
		System.out.println("Enter name of book");
		String name = sc.nextLine();
		
		System.out.println("Enter price of "+name);
		int price = sc.nextInt();
		
		book.setName(name);
		book.setPrice(price);
		book.setCreated_timestamp(LocalDateTime.now());
		
		BookDAOImpl impl = new BookDAOImpl();
		String out = impl.createNewBook(book);
		System.out.println(out);
	}

}
