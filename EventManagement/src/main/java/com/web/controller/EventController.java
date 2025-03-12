package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.entity.Events;
import com.web.service.EventService;

@RestController
@RequestMapping("/create")
public class EventController {
	
	@Autowired
	EventService imp;
	
	@RequestMapping("/get/{eventId}")
	public Events getEvent(@PathVariable int eventId) {
		return imp.getEvent(eventId);
	}
	
	@PostMapping()
	public String insertEvent(@RequestBody Events create) {
		imp.insertEvent(create);
		return "Insert Event";
	}

}
