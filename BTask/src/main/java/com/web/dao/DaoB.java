package com.web.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.web.mod.ModB;

@Repository
public class DaoB implements DaoI{
	
	private static final String SELECT_EMP_SQL="select * from Emp";
	
	@Autowired
	private JdbcTemplate j;

	public List<ModB> getB() {
		List<ModB> i=j.query(SELECT_EMP_SQL,new BeanPropertyRowMapper<ModB>(ModB.class));
		return i;
	}

	
	
	
}
