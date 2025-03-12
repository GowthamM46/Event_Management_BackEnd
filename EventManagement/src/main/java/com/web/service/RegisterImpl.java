package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.entity.EventRegistration;
import com.web.repository.RegisterRepository;

@Service
public class RegisterImpl implements RegisterService{
	  @Autowired
      RegisterRepository rep;
	  
	  

	public RegisterImpl() {}
	@Override
	public EventRegistration getRegister(int id) {
		
		return rep.findById(id).get();
	}
	@Override
	public EventRegistration insertRegister(EventRegistration register) {
		
		return rep.save(register);
	}
	

	

	

}
