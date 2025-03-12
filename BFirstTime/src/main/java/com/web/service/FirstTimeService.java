package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.FirstTimeDAO;
import com.web.model.FirstTimeModel;

@Service
public class FirstTimeService implements ServiceImp {

	@Autowired
	private FirstTimeDAO dao;
	@Override
	public List<FirstTimeModel> getFirstTime() {
		
		return dao.getFirstTime();
	}
	@Override
	public String addEmployee(FirstTimeModel fst) {
		
		return dao.addEmployee(fst);
	}
	@Override
	public List<FirstTimeModel> updateEmployee(int id, String name) {
		
		return dao.updateEmployee(id,name);
	}

	
	
	
	
	
}
