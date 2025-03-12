package com.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerBpractise {

	@GetMapping("viewtheempdetails")
	public void bpractise() {
		System.out.println("Datas");
  }
	 @PostMapping("addEmployeedetails")
	public void bGetDatas() {
		 		 
	 }
}
