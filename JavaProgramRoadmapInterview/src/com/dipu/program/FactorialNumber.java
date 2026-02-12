package com.dipu.program;

public class FactorialNumber {

	public static void main(String[] args) {

		int num = 5, factorial = 1;

//		for (int i = 2; i <= num; i++) {
//			
//			factorial =  factorial*i;
//			//System.out.println("Calculation of "+i+"*"+i+"="+factorial);
//			 System.out.println("Calculation of " + (i - 1) + " * " + i + " = " + factorial);
//		}
		for (int i = 1; i <= num; i++) {
			System.out.println("Multiplying " + factorial + " * " + i+ "="+factorial*i);
			factorial = factorial * i;
		}
		System.out.println("Final Result :" + factorial);
	}
}
