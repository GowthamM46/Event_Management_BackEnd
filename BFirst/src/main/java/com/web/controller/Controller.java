package com.web.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.Modell;
import com.web.service.Serviceee;

@RestController
public class Controller {
    
	
	@Autowired
	private Serviceee s;
	
	@GetMapping("/first")
	private List<Modell> first() {
		return s.first();
	}
	@PostMapping("/second")
	private String second() {
	   Modell gow=new Modell(3,"GowBri","Chennai"); 
         return s.second(gow);
	}
	
	@PutMapping("/third")
	private List<Modell> third() {
	   int id=2;
	   String name="BriGow";
	   return s.third(id,name);

	}
	
}
