package com.web.controllerr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.mod.ModB;
import com.web.serv.SerB;

@RestController
public class ContB {
	
	@Autowired
	private SerB s;
	
	
	@GetMapping("/bget")
	private List<ModB> getB() {
		return s.getB();

	}
	@PostMapping("/bpost")
	private String postB(@RequestBody ModB mod) {
		return (String) s.postB(mod);
	}
	@PutMapping("/bupd")
	private  List<ModB> updB(@RequestBody ModB mod) {
		return s.updB(mod);
	}

}
