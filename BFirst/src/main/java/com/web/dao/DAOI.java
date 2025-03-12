package com.web.dao;

import java.util.List;

import com.web.model.Modell;

public interface DAOI {

	  List<Modell> first();
	  
	  String second(Modell gow);
	  
	  List<Modell> third(int id, String name);
}
