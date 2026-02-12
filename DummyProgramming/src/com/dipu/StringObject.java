package com.dipu;

public class StringObject {

	public static void main(String[] args) {
		String s = new String("csd");
		String s1 = "code";
		s = new String("planet");
		String s2 = new String("csd");
		s2= s.concat("tech");	
		System.out.println(s); 
		System.out.println(s1);
		System.out.println(s2);
	}
}
