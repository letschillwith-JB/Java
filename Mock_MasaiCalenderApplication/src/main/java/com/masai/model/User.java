package com.masai.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Valid
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Email
	private String email;
	
	@NotBlank
	@Pattern(regexp = "^[a-zA-Z]*$")
	private String firstName;
	
	@NotBlank
	@Pattern(regexp = "^[a-zA-Z]*$")
	private String lastName;
	
	@NotBlank
	@Size(min = 10, max = 10)
	private String mobileNumber;
	
	@NotBlank
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\\\S+$).{6,12}$")
	private String password;
	
	@NotNull
	@Past
	private LocalDate dateOfBirth;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Event> events = new HashSet<>(); 
	
}
