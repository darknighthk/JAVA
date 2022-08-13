package com.basics.cloneconcept;

public class Student implements Cloneable{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" "+this.name;
	}
	

}
