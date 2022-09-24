package com.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Hall {
	User owner;

	float width;
	float length;
	List<Event> eventList;
	public User getOwner() {
		return owner;
	}
	
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public float getWidth() {
		return width;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	public float getLength() {
		return length;
	}
	
	public void setLength(float length) {
		this.length = length;
	}
	public List<Event> getEventList() {
		return eventList;
	}
	public void setEventList(List<Event> eventList) {
		this.eventList=eventList;
	}
	
	

	public void displayEventList() {
		
	}
	

}
