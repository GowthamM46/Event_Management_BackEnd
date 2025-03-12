package com.web.service;

import com.web.entity.EventRegistration;

public interface RegisterService {
	
	public EventRegistration getRegister(int id);
	public EventRegistration insertRegister(EventRegistration register);

}
