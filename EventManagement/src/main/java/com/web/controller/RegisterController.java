package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.entity.EventRegistration;
import com.web.service.RegisterImpl;

@RestController
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	RegisterImpl reg;
	
	
	
	public RegisterController() {}

	@GetMapping("/get/{id}")
	public EventRegistration getRegister(@PathVariable int id) {
		return reg.getRegister(id);
	}

	@PostMapping
	public EventRegistration insertRegister(@RequestBody EventRegistration register) {
		return reg.insertRegister(register);
	}
}
