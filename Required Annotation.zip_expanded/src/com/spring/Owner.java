package com.spring;

import org.springframework.beans.factory.annotation.Required;

public class Owner {
	String name;
	String password;
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	@Required
	public void setPassword(String password) {
		this.password = password;
	}
	
}
