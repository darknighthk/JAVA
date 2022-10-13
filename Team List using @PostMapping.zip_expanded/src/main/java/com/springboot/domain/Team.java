package com.springboot.domain;

public class Team {
	
	private Long id;
	private String name;
	private String captain;
	private Integer size;
	private String color;

	public Team(){
	}	

	public Team(Long id, String name, String captain,
			Integer size, String color) {
		super();
		this.id = id;
		this.name = name;
		this.captain = captain;
		this.size = size;
		this.color = color;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCaptain() {
		return captain;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}

