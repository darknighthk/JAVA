package com.spring;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ContactDetail {
    ArrayList<String> contactNumbers;
	
	String email;
	
	Address address;
	
	public ArrayList<String> getContactNumbers() {
		return contactNumbers;
	}
	public void setContactNumbers(ArrayList<String> contactNumbers) {
		this.contactNumbers = contactNumbers;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public void display() {
		System.out.println("The contact numbers are");
		for (String string : this.contactNumbers) {
			System.out.println(string);
		}
		System.out.println("email : "+this.email);
		this.address.display();
		


	}

}
