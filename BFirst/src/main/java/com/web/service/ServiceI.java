package com.web.service;

import java.util.List;

import com.web.model.Modell;

public interface ServiceI {
	List<Modell> first();
	String second(Modell gow);
	List<Modell> third(int id, String name);

}
