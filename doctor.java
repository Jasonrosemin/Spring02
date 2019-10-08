package com.QueteSpring;

public class doctor {
	private int number;
	private String name;
	
	public doctor(String name, int number) {
		this.setName(name);
		this.setNumber(number);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
