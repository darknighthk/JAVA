package com.spring;
import java.util.ArrayList;

public class Event {
	private String name;
	private int id;
	//ArrayList<Integer> Seatno;
	
	public String getName() {
		return name;
	}

	Event() {
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public ArrayList<Integer> getSeatno() {
//		return Seatno;
//	}
//
//	public void setSeatno(ArrayList<Integer> seatno) {
//		Seatno = seatno;
//	}

	public void display() {
		System.out.println(this.id+".)"+this.name);
	}

}
