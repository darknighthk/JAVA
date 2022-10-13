package com.spring.entity;

import java.util.List;

public class Stall {

	private Integer id;
	private String stallName;
	private String detail;
	private String stallOwner;
	private String itemsAvailable;
	public Stall() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stall(Integer id, String stallName, String detail, String stallOwner, String itemsAvailable) {
		super();
		this.id = id;
		this.stallName = stallName;
		this.detail = detail;
		this.stallOwner = stallOwner;
		this.itemsAvailable = itemsAvailable;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStallName() {
		return stallName;
	}
	public void setStallName(String stallName) {
		this.stallName = stallName;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getStallOwner() {
		return stallOwner;
	}
	public void setStallOwner(String stallOwner) {
		this.stallOwner = stallOwner;
	}
	public String getItemsAvailable() {
		return itemsAvailable;
	}
	public void setItemsAvailable(String itemsAvailable) {
		this.itemsAvailable = itemsAvailable;
	}

}
