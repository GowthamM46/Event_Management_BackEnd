package com.web.ser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.da.DaoI;
import com.web.da.Daoo;
import com.web.m.Mod;

@Service
public class Ser implements DaoI {
	
	@Autowired
	private Daoo d;

	public List<Mod> getB() {
		
		return d.getB();
	}

	
	

}
