package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.models.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
