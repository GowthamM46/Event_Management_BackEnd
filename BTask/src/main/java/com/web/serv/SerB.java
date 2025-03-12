package com.web.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.DaoB;
import com.web.mod.ModB;

@Service
public class SerB implements SerI {

	
	@Autowired
	private DaoB d;

	public List<ModB> getB() {
		
		return d.getB();
	}

	public Object postB(ModB mod) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ModB> updB(ModB mod) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
