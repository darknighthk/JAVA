package com.basics.innerclasses;

public class Outer {
	static void s1() {
		System.out.println("its outer class");
	}

	static class inner{
		static void s2() {
			System.out.println("its inner class");
		}
	}
	public static void main(String[] args) {
		Outer.s1();
		inner.s2();
		s1();
		Outer.inner.s2();
	}

}
