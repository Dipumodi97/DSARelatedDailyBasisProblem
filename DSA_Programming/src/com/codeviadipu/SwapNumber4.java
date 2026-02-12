package com.codeviadipu;

import java.util.Scanner;

public class SwapNumber4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		int a = sc.nextInt();
		System.out.println("Enter b value:");
		int b = sc.nextInt();
		swapNumber(a, b);
		//System.out.println("Enter the value of a is"+a+"and b is "+b);
	}
	
	static void swapNumber(int a ,int b) {
		System.out.println("before swapping of a = "+a+" and b = "+b);
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("after swapping of a = "+a+" and b ="+b);
	}
}
