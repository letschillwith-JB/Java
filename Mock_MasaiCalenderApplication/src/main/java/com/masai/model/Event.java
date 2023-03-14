package com.masai.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eventId;
	private EventType type;
	private LocalDate startDate;
	private LocalDate endDate;
	private LocalTime time;
	
	
	
}
