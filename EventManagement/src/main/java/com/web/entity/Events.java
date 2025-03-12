package com.web.entity;

//import java.sql.Date;
//import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="events")
public class Events {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eventId;
	private String title;
	private String description;
	private String location;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate eventDate;
	@JsonFormat(pattern = "HH:mm:ss")  
	private LocalTime eventTime;
	private String category;
	private String organizerName;
	private double price;
	
	
	
	public Events() {}



	public int getEventId() {
		return eventId;
	}



	public void setEventId(int eventId) {
		this.eventId = eventId;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public LocalDate getEventDate() {
		return eventDate;
	}



	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}



	public LocalTime getEventTime() {
		return eventTime;
	}



	public void setEventTime(LocalTime eventTime) {
		this.eventTime = eventTime;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public String getOrganizerName() {
		return organizerName;
	}



	public void setOrganizerName(String organizerName) {
		this.organizerName = organizerName;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public Events(int eventId, String title, String description, String location, LocalDate eventDate, LocalTime eventTime,
			String category, String organizerName, double price) {
		
		this.eventId = eventId;
		this.title = title;
		this.description = description;
		this.location = location;
		
		this.eventDate = eventDate;
		
		this.eventTime = eventTime;
		this.category = category;
		this.organizerName = organizerName;
		this.price = price;
	}
	
	
	
	
	
	

}
