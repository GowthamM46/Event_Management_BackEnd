package com.web.ser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.Dao.BD;
import com.web.mod.BPM;

@Service
public class Bser implements BI{
   
	 @Autowired
	 private BD d;
	public List<BPM> fB() {
		
		return d.fB();
	}
	public String sB(BPM r) {
		
		return d.sB(r);
	}

}
