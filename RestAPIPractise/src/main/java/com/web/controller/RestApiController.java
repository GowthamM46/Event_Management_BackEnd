package com.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.ModelRestApi;

@RequestMapping("/rest")
@RestController
public class RestApiController {
	
	
	ModelRestApi model;
	
	@GetMapping("/user")
	public ModelRestApi getHello() {
		return model;
	}
     
	@PostMapping("/insert")
	public String getHello(@RequestBody ModelRestApi model) {
		this.model=model;
		return "Successful ";
		
	}
	
	@PutMapping("/update")
	public String getUpdate(@RequestBody ModelRestApi model) {
		this.model=model;
		return "Updated";
	}
	
	@DeleteMapping("/delete")
	public String getDelete(@RequestBody ModelRestApi model) {
		this.model=null;
		return "deleted";
	}
	
}
