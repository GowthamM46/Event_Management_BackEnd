package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
