package com.basics.innerclasses;

import com.basics.innerclasses.Outer.inner;

public class Outer1 {
	static void s1() {
		System.out.println("its outer class");
	}

	static class inner1{
		static void s2() {
			System.out.println("its inner class");
		}
		void s3() {
			System.out.println("Its s3 in inner1 class");
		}
	}
	public static void main(String[] args) {
		s1();
		inner1.s2();
		inner1 name=new inner1();
		name.s3();
	
	}

}
