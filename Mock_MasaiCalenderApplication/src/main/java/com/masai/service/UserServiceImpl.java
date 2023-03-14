package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.EventException;
import com.masai.Exception.UserException;
import com.masai.model.Event;
import com.masai.model.User;
import com.masai.repository.EventRepo;
import com.masai.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private EventRepo eventRepo;
	
	@Override
	public User registerUser(User user) throws UserException {
		// TODO Auto-generated method stub
		Optional<User> userAlreadyExist = userRepo.findById(user.getEmail());
		if(userAlreadyExist.isPresent()) {
			throw new UserException("User Already Existed...");
		}else {
			userRepo.save(user);
			System.out.println("User Registered successfully...");
			return user;
		}
	}

	@Override
	public User userLogin(String email, String password) throws UserException {
		Optional<User> userAlreadyExist = userRepo.findById(email);
		if(userAlreadyExist.isEmpty()) {
			throw new UserException("Register first...");
		}else {
			User user = userAlreadyExist.get();
			if(user.getPassword().equals(password)) {
				System.out.println("Login successfull...");
				return user;
			}else {
				throw new UserException("Invalid Password...");
			}
		}
	}

	@Override
	public Event createEvent(Event event) throws EventException {
		// TODO Auto-generated method stub
		return eventRepo.save(event);
	}

	@Override
	public Event updateEvent(int eventId, Event event) throws EventException {
		// TODO Auto-generated method stub
		Optional<Event> optionalEvent = eventRepo.findById(eventId);
		if(optionalEvent.isPresent()) {
			Event existedEvent = optionalEvent.get();
			existedEvent.setStartDate(event.getStartDate());
			existedEvent.setType(event.getType());
			existedEvent.setEndDate(event.getEndDate());
			existedEvent.setTime(event.getTime());
			
			System.out.println("Event updated successfully...");
			return eventRepo.save(existedEvent);
		}
		else {
			throw new EventException("Event not existed...");
		}
	}

	@Override
	public Event deleteEvent(int eventId) throws EventException {
		Optional<Event> event = eventRepo.findById(eventId);
		if(event.isPresent()) {
			Event existedEvent = event.get();
			eventRepo.delete(existedEvent);
			System.out.println("Event Deleted successfully...");
			return existedEvent;
		}
		throw new EventException("Event not existed with given id");
	}

	
}
