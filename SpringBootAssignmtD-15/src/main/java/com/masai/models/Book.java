package com.masai.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	private int book_Id;
	private String name;
	private String author;
	private String category;
	private int pages;
	private int price;
	
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [book_Id=" + book_Id + ", name=" + name + ", author=" + author + ", category=" + category
				+ ", pages=" + pages + ", price=" + price + "]";
	}
	public int getBook_Id() {
		return book_Id;
	}
	public void setBook_Id(int book_Id) {
		this.book_Id = book_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book(int book_Id, String name, String author, String category, int pages, int price) {
		super();
		this.book_Id = book_Id;
		this.name = name;
		this.author = author;
		this.category = category;
		this.pages = pages;
		this.price = price;
	}
}
