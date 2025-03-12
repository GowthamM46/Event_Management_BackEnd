package com.web.service;

import com.web.entity.Events;

public interface EventService {
	
	public Events getEvent(int eventId);
	public String insertEvent(Events create);

}
