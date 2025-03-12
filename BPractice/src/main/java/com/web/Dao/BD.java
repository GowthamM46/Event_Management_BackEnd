package com.web.Dao;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.web.mod.BPM;
@Repository
public class BD {
   
	static List<BPM> b=new LinkedList<>();
	static {
		  
		b.add(new BPM(1,"Gowtham M", "Chennai"));
		b.add(new BPM(1,"Brinda T R", "Chennai"));
		b.add(new BPM(1,"Mohana T R", "Chennai"));
		
	}
	
	public List<BPM> fB() {
		
		return b;
	}

	public String sB(BPM r) {
		Boolean i=b.add(r);
		return i?"Yes":"NO";
	}

}
