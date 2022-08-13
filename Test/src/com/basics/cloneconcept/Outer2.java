package com.basics.cloneconcept;

import org.xml.sax.ext.Attributes2;

public class Outer2 {
	void s1() {
		System.out.println("Its outer 2 method");
	}

	class inner2{
		void s2() {
			System.out.println("inner class s2 method");
		}
		
		void s3() {
			System.out.println("inner class s3 method");
			
		}
	}
	public static void main(String[] args) {
		Outer2 outer2=new Outer2();
		outer2.s1();
		
		Outer2.inner2 i2 = outer2.new inner2();
		i2.s2();
		i2.s3();
	}

}
