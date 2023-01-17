package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.masai.models.Student;
import com.masai.repository.StudentRepository;

@Controller
public class StudentController {
	
	@Autowired
	private StudentRepository srepo;
	
	@PostMapping("/register")
	public Student registerStudent(@RequestBody Student student) {
		return srepo.save(student);
	}
}
