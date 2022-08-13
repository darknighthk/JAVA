package com.basics.cloneconcept;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1=new Student(1, "Anee");
		Student s2=(Student) s1.clone();
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.toString());
	}

}
