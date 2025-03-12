
package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.FirstTimeModel;
import com.web.service.FirstTimeService;

@RestController
public class FirstTimeController {
	
    @Autowired
	private FirstTimeService service;
    
    
@GetMapping("/getfirsttime")
private List<FirstTimeModel> getFirstTime() {
	return service.getFirstTime();

}
@PostMapping("/addemployee")
private String addEmployee() {
	FirstTimeModel fst=new FirstTimeModel(4,"SSS","CSS");
	return service.addEmployee(fst);
}

@PutMapping("/updateEmployee")
private List<FirstTimeModel> updateEmployee() {
	int id=3;
	String name="Hello";
	return service.updateEmployee(id,name);

}

}
