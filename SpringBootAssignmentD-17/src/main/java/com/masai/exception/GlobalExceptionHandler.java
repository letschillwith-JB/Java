package com.masai.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(EmployeeException.class)
	public ResponseEntity<MyErrorDetails> employeeExceptionHandler(EmployeeException ee, WebRequest we){
		
		MyErrorDetails err = new MyErrorDetails(LocalDate.now(),ee.getMessage(),we.getDescription(false));
		return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(AddressException.class)
	public ResponseEntity<MyErrorDetails> addressExceptionHandler(AddressException ae, WebRequest we){
		
		MyErrorDetails err = new MyErrorDetails(LocalDate.now(),ae.getMessage(),we.getDescription(false));
		return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> genericExceptionHandler(Exception ee, WebRequest we){
		
		MyErrorDetails err = new MyErrorDetails(LocalDate.now(),ee.getMessage(),we.getDescription(false));
		return new ResponseEntity<>(err,HttpStatus.BAD_GATEWAY);
		
	}
}
