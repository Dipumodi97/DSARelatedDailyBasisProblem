package com.dipu;

public class IncrementDecrement {

	public static void main(String[] args) {
		int a =10;
		int b = 20;
		
		System.out.println(a++ + ++b);//31
		System.out.println(a-- + --b);//29
		System.out.println(a++ + a + --b);//10+11+19
		
	}
}
