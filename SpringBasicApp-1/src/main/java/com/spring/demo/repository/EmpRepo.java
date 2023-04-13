package com.spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.model.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer>{ 

}
