package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import com.masai.models.Student;

@Controller
public interface StudentRepository extends JpaRepository<Student, Integer>{

	
}
