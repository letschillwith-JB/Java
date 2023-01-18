package com.masai.exception;

import java.time.LocalDate;

public class MyErrorDetails {
	private LocalDate localDate;
	private String message;
	private String details;
	public MyErrorDetails(LocalDate localDate, String message, String details) {
		super();
		this.localDate = localDate;
		this.message = message;
		this.details = details;
	}
	public MyErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
