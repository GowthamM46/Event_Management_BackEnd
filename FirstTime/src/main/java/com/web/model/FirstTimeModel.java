package com.web.model;

public class FirstTimeModel {
   
	private int id;
	private String name;
	private String add;
	
	public FirstTimeModel(int id, String name, String add) {
		this.id = id;
		this.name = name;
		this.add = add;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAdd() {
		return add;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
}
