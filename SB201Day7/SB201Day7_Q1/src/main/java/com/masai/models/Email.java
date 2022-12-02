package com.masai.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Email {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mail_id;
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	private User user;
	
	
	
	public Email() {
		// TODO Auto-generated constructor stub
	}



	public Email( String email) {
		super();
		
		this.email = email;
		
	}



	public int getMail_id() {
		return mail_id;
	}



	public void setMail_id(int mail_id) {
		this.mail_id = mail_id;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "Email [mail_id=" + mail_id + ", email=" + email + ", user=" + user + "]";
	}
	
	

}
