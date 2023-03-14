package com.masai.Exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MyErrorDetails {
	private LocalDateTime timestamp;
	private String message;
	private String details;
	
	
	

}
