package com.wesb;

public class AterModel {
	
	private int id;
	private String name;
	private int Roll;
	
	
	public AterModel(int id, String name, int roll) {
		
		this.id = id;
		this.name = name;
		Roll = roll;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return Roll;
	}
	public void setRoll(int roll) {
		Roll = roll;
	}
	
	

}
