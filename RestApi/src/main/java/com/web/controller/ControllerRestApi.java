package com.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.ModelRestApi;
import com.web.service.ServiceClassRestApi;

@RestController
@RequestMapping("/source")
public class ControllerRestApi {
	
        ServiceClassRestApi service;
        
        
	
	public ControllerRestApi(ServiceClassRestApi service) {
			
			this.service = service;
		}

	@GetMapping("/get/{rollnum}")
	public ModelRestApi getModel(@PathVariable("rollnum") String rollnum) {
		
		return service.getModel(rollnum);
	}
	
	@PostMapping("/insert")
	public String insertModel(@RequestBody ModelRestApi model) {
		service.insertModel(model);
		
		return "Insert";
	}
	@PutMapping("/update")
	public String updateModel(@RequestBody ModelRestApi model) {
		service.updatetModel(model);
		return "Update";
	}
	@DeleteMapping("/delete/{rollnum}")
	public String deleteModel(@PathVariable("rollnum") String rollnum) {
		service.deleteModel(rollnum);
		
		return "Deleted";
	}
	@GetMapping("/getAll")
	public List<ModelRestApi> getAllModel() {
		
		return service.getAllModel();
	}
	
	
	

}
