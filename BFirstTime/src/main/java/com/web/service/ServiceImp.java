package com.web.service;

import java.util.List;

import com.web.model.FirstTimeModel;

public interface ServiceImp {

	List<FirstTimeModel> getFirstTime();
	  
	String addEmployee(FirstTimeModel fst);
	
	List<FirstTimeModel> updateEmployee(int id, String name);
}

