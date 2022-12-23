package com.masai.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
	private String name;
	private int price;
	private LocalDateTime created_timestamp;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public LocalDateTime getCreated_timestamp() {
		return created_timestamp;
	}
	public void setCreated_timestamp(LocalDateTime created_timestamp) {
		this.created_timestamp = created_timestamp;
	}
	public Book(int bookId, String name, int price, LocalDateTime created_timestamp) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.price = price;
		this.created_timestamp = created_timestamp;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", price=" + price + ", created_timestamp="
				+ created_timestamp + "]";
	}
	
	

}
