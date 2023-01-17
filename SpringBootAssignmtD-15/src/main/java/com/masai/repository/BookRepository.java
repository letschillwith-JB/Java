package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.masai.models.Book;

@RestController
public interface BookRepository extends JpaRepository<Book, Integer>{

	
}
