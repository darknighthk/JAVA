package com.basics.cloneconcept;



public class Outer4 {
	void s1() {
		System.out.println("Its outer 4 methods");
		class inner4{
			void s2() {
				System.out.println("Its inner s2 method");
			}
		}
		inner4 i4=new inner4();
		i4.s2();
		
	}
	public static void main(String[] args) {
		Outer4 o4 = new Outer4();
		o4.s1();
		
		
		o4.s3();
	}
	
	void s3() {
		System.out.println("Its s3 method");
		class inner5{
			void s4()
			{
				System.out.println("Its inner5 methods");
			}
			}
		inner5 i5=new inner5();
		i5.s4();
	}
}
