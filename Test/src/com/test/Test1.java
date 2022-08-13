package com.test;

import java.util.*;
public class Test1{
    public static void main(String[] args){    	     
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine(),s2=sc.nextLine();
        if(s1.length()!=s2.length()) System.out.println(s2+" IS WRONG");
        else
        	if(s1.equals(s2)) System.out.println(s1+" IS CORRECT");
        	else {
        		int i=0,d=0,n=s1.length();
        		
        		while(i<n) {
        			if(s1.charAt(i)!=s2.charAt(i++)) d++;
        		}
        		if(d<3) System.out.println(s2+" IS ALMOST CORRECT");
        		else System.out.println(s2+" IS WRONG");
        	}
		
    }
}