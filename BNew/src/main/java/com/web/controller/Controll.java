package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.m.Mod;
import com.web.ser.Ser;

@RestController
public class Controll {
	
	@Autowired
	private Ser s;
	
	@GetMapping("/fst")
	private List<Mod> getB() {
		return s.getB();

	}
	

}
