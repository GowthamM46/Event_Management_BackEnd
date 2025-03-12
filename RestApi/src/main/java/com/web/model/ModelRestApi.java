package com.web.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="model_rest")
public class ModelRestApi {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private String rollnum;
	private String name;
	private String dept;
	
	
	
	public ModelRestApi() {
		
	}

	public ModelRestApi(String rollnum, String name, String dept) {
		
		this.rollnum = rollnum;
		this.name = name;
		this.dept = dept;
	}

	public String getRollnum() {
		return rollnum;
	}

	public void setRollnum(String rollnum) {
		this.rollnum = rollnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	
	
	
	
	

}
