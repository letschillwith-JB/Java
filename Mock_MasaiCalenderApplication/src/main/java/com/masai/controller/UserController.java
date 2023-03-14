package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.masai.Exception.EventException;
import com.masai.Exception.UserException;
import com.masai.model.Event;
import com.masai.model.User;
import com.masai.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/masaicalender/register")
	public ResponseEntity<User> registerUser(@RequestBody User user) throws UserException{
		User returnUser =  userService.registerUser(user);
		return new ResponseEntity<User> (returnUser,HttpStatus.CREATED); 
	}
	 @PostMapping("/masaicalender/login")
	    public ResponseEntity<User> userLogin(@RequestParam String email, @RequestParam String password) throws UserException {
	        User user = userService.userLogin(email, password);
	        return new ResponseEntity<>(user, HttpStatus.OK);
	    }

	    @PostMapping("/masaicalender/event")
	    public ResponseEntity<Event> createEvent(@RequestBody Event event) throws EventException {
	        Event createdEvent = userService.createEvent(event);
	        return new ResponseEntity<>(createdEvent, HttpStatus.CREATED);
	    }

	    @PutMapping("/masaicalender/event/{id}")
	    public ResponseEntity<Event> updateEvent(@PathVariable("id") int eventId, @RequestBody Event event) throws EventException {
	        Event updatedEvent = userService.updateEvent(eventId, event);
	        return new ResponseEntity<>(updatedEvent, HttpStatus.OK);
	    }

	    @DeleteMapping("/masaicalender/event/{id}")
	    public ResponseEntity<Event> deleteEvent(@PathVariable("id") int eventId) throws EventException {
	        Event deletedEvent = userService.deleteEvent(eventId);
	        return new ResponseEntity<>(deletedEvent, HttpStatus.OK);
	    }


}
