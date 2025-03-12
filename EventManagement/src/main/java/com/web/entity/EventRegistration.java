package com.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="event_register")
public class EventRegistration {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String email;
	private String eventName;
	private String mobNumber;
	private int ticketCount;
	private String paymentMethod;
	private boolean registrationStatus;
	private int eventId;
	
	
	
//	public EventRegistration() {}
//
//
//
//	public EventRegistration(int id, String email, String eventName, String mobNumber, int ticketCount,
//			String paymentMethod, boolean registrationStatus, int eventId) {
//		
//		this.id = id;
//		this.email = email;
//		this.eventName = eventName;
//		this.mobNumber = mobNumber;
//		this.ticketCount = ticketCount;
//		this.paymentMethod = paymentMethod;
//		this.registrationStatus = registrationStatus;
//		this.eventId = eventId;
//	}
//
//
//
//	public int getId() {
//		return id;
//	}
//
//
//
//	public void setId(int id) {
//		this.id = id;
//	}
//

//
//	public String getEmail() {
//		return email;
//	}
//
////
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//
//
//	public String getEventName() {
//		return eventName;
//	}
//
//
//
//	public void setEventName(String eventName) {
//		this.eventName = eventName;
//	}
//
//
//
//	public String getMobNumber() {
//		return mobNumber;
//	}
//
//
//
//	public void setMobNumber(String mobNumber) {
//		this.mobNumber = mobNumber;
//	}
//
//
//
//	public int getTicketCount() {
//		return ticketCount;
//	}
//
//
//
//	public void setTicketCount(int ticketCount) {
//		this.ticketCount = ticketCount;
//	}

//
//
//	public String getPaymentMethod() {
//		return paymentMethod;
//	}



//	public void setPaymentMethod(String paymentMethod) {
//		this.paymentMethod = paymentMethod;
//	}
//
//
//
//	public boolean isRegistrationStatus() {
//		return registrationStatus;
//	}
//
//
//
//	public void setRegistrationStatus(boolean registrationStatus) {
//		this.registrationStatus = registrationStatus;
//	}
//
//
//
//	public int getEventId() {
//		return eventId;
//	}
//
//
//
//	public void setEventId(int eventId) {
//		this.eventId = eventId;
//	}
//	
	       

}
