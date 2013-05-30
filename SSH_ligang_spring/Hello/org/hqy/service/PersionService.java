package org.hqy.service;

public class PersionService {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void info(){
		System.out.println("name:"+name);
	}

}
