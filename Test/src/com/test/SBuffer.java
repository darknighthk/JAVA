package com.test;

public class SBuffer {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
	
		sb.append("Hello Wold");
		sb.append("java training is going on");
		System.out.println(sb.capacity());
	
		System.out.println(sb);
		System.out.println("CharAt :"+sb.charAt(6));
		
		StringBuffer sb1=new StringBuffer("HEY Bro!");
		System.out.println(sb1.reverse());
	}

}
