package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.entity.Events;
import com.web.repository.EventRepository;

@Service
public class EventImpl implements EventService{

	@Autowired
	EventRepository rep;
	
	
	
	public EventImpl() {}

	@Override
	public Events getEvent(int eventId) {
		
		return rep.findById(eventId).get();
	}
	
	@Override
	public String insertEvent(Events create) {
		rep.save(create);
		return "Success";
	}

}
