package com.spring;

import org.springframework.beans.factory.annotation.Required;

public class Hall {

	Owner owner;
	int width,length;
	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public int getWidth() {
		return width;
	}
	@Required
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	@Required
	public void setLength(int length) {
		this.length = length;
	}
	
	public void display() {
		
	}
	
}
