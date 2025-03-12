package com.contr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ser.LoginSer;
import com.web.Emp;

@RestController
@RequestMapping("/acc")
public class LoginCont {
	
	@Autowired
	LoginSer s;
	
	@PostMapping("/get")
	public Emp empLogin(@RequestBody Emp emp) {
		
		Emp e=s.empLogin(emp);
		return e;
	}
	

}
