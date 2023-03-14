package com.masai.service;


import org.springframework.stereotype.Service;

import com.masai.Exception.EventException;
import com.masai.Exception.UserException;
import com.masai.model.Event;
import com.masai.model.User;

@Service
public interface UserService {
	
	public User registerUser(User user) throws UserException;
	
	public User userLogin(String email, String password)throws UserException;

	public Event createEvent(Event event)throws EventException;
	
	public Event updateEvent(int eventId, Event event) throws EventException;
	
	public Event deleteEvent(int eventId) throws EventException;
}
