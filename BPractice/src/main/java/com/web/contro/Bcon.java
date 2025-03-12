package com.web.contro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.mod.BPM;
import com.web.ser.Bser;

@RestController
public class Bcon {
	@Autowired
	private Bser s;
	
	@GetMapping("/f")
	private List<BPM> fB() {
		return  s.fB();
		

	}
	
	@PostMapping("/s")
	private String sB() {
		BPM r=new BPM(4,"Gowtham Brinda","Chennai");
       return s.sB(r);
	}
    
	@PutMapping("/t")
	private void tB() {
		// TODO Auto-generated method stub

	}
}
