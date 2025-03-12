package com.web.dao;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.web.model.FirstTimeModel;

@Repository
public class FirstTimeDAO implements FirstTimeDaoInterface {

	static List<FirstTimeModel> b=new LinkedList<>();
	
	static {
		b.add(new FirstTimeModel(1,"Brinda","Chennai"));
		b.add(new FirstTimeModel(2,"Gowtham","Chennai"));
		b.add(new FirstTimeModel(3,"Mohana","Chennai"));
		
	}

	@Override
	public List<FirstTimeModel> getFirstTime() {
		
		return b;
	}

	@Override
	public String addEmployee(FirstTimeModel fst) {
		boolean status = b.add(fst);
		return status? "Inserted" : "Failed ";
	}

	@Override
	public List<FirstTimeModel> updateEmployee(int id, String name) {
		FirstTimeModel emp=b.get(id);
		emp.setName(name);
		b.set(id, emp);

		return  getFirstTime();
	}


}
