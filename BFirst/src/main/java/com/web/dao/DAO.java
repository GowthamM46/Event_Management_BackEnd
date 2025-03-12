package com.web.dao;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.web.model.Modell;
@Repository
public class DAO implements DAOI{

	static List<Modell> b=new LinkedList<>();
	static {
		b.add(new Modell(1,"Brinda","Chennai"));
		b.add(new Modell(2,"Gowtham","Chennai"));
	}
	@Override
	public List<Modell> first() {
		
		return b;
	}
	@Override
	public String second(Modell gow) {
		boolean l=b.add(gow);
		
		return l?"Insert":"Wait a moment";
	}
	public List<Modell> third(int id, String name) {
		Modell o=b.get(id);
		o.setName(name);   //////
		b.set(id, o);     //////
		return first();
	}
	

}
