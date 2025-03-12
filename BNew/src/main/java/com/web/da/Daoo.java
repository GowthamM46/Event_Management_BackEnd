package com.web.da;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.web.m.Mod;

@Repository
public class Daoo implements DaoI {
	
	static List<Mod> b=new LinkedList<>();
	static {
		b.add(new Mod(1,"Gowtham","Chennai"));
		b.add(new Mod(2,"Brinda","Chennai"));
	}
	@Override
	public List<Mod> getB() {
		// TODO Auto-generated method stub
		return b;
	}
	
	

}
