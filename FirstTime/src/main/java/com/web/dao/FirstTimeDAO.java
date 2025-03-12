package com.web.dao;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.web.model.FirstTimeModel;

@Repository
public class FirstTimeDAO {

	static List<FirstTimeModel> b=new LinkedList<>();
	
	static {
		b.add(new FirstTimeModel(1,"Brinda","Chennai"));
		b.add(new FirstTimeModel(2,"Gowtham","Chennai"));
		b.add(new FirstTimeModel(3,"Mohana","Chennai"));
		
	}
public List<FirstTimeModel> getFirstTime() {
		
		return b;
	}

}
