package com.web.dao;

import java.util.List;

import com.web.model.FirstTimeModel;

public interface FirstTimeDaoInterface {

	
	List<FirstTimeModel> getFirstTime();
	
	String addEmployee(FirstTimeModel fst);
	
	List<FirstTimeModel> updateEmployee(int id, String name);
	
	
	
}
