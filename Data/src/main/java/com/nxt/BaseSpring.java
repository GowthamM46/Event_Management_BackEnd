package com.nxt;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseSpring {
	
	public static void main(String[] args) throws SQLException {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Dataaaa.xml");
		
		Clanew clanew = context.getBean("clanew",Clanew.class);
		
		List<DataFetch> details = clanew.getDetails();
		
		for(DataFetch x:details) {
			System.out.println(x.getId()+" "+x.getName());
		}
	}

}
