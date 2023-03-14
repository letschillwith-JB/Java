package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Event;

@Repository
public interface EventRepo extends JpaRepository<Event, Integer>{

}
