package com.basics.cloneconcept;



public class Outer3 {

	private static int x=50;
	private int y;
	
	
	
	public Outer3(int y) {
		super();
		this.y = y;
	}

	void s1() {
		System.out.println("Its outer 3 method");
		System.out.println(y);
		System.out.println();
	}

	class inner3{
		private int y;

		public inner3(int y) {
			super();
			this.y = y;
		}
		void s2() {
			System.out.println("its s2 method");
			System.out.println(y);
			System.out.println(Outer3.this.y);
		}
	}
	public static void main(String[] args) {
		Outer3 o3=new Outer3(999);
		o3.s1();
		
		Outer3.inner3 i3 = o3.new inner3(888);
		i3.s2();
		System.out.println(i3.y);
	}

}
