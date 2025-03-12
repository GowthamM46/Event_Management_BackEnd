package com.webb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ord.ser.AfterSer;

@RestController
public class AterController {
	
	@Autowired
	private AfterSer ser;
	
	@GetMapping("/enter")
	private List<AfterModel> aftGet() {
		return ser.aftGet();
		

	}
	

}
