package com.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Event {

	int id;
	String eventName;
	Owner eventOrganiser;

	public Event() {
		System.out.println("...Creating a new event...");
	}

	public Event(int id) {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Owner getEventOrganiser() {
		return eventOrganiser;
	}

	public void setEventOrganiser(Owner eventOrganiser) {
		this.eventOrganiser = eventOrganiser;
	}

	public void display() {
		System.out.print(this.id + ")" + this.eventName + " - ");
		this.eventOrganiser.display();
	}

	public void setProperties(String eventName) {
		this.setEventName(eventName);

	}

	Event(int id, String eventName, Owner eventOrganiser) {
		super();

		this.id = id;
		this.eventName = eventName;
		this.eventOrganiser = eventOrganiser;
	}

}
