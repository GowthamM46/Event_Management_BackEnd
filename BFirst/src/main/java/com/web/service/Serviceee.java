package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.DAO;
import com.web.model.Modell;

@Service
public class Serviceee implements ServiceI {

	@Autowired
	private DAO dao;
	
	
	@Override
	public List<Modell> first() {
		return dao.first();
	}


	public String second(Modell gow) {
		
		return dao.second(gow);
	}


	public List<Modell> third(int id, String name) {
		
		return dao.third(id,name);
	}

}
