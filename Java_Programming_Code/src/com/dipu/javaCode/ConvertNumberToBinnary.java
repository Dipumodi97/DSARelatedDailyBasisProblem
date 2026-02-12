package com.dipu.javaCode;

import java.util.Scanner;

/**
 * 1.ConvertNumberToBinnary 
 * Input =10 
 * Output = 1010
 * 
 * 2.replace the number '0' and '1' to any character using Scanner class
 * 
 */

public class ConvertNumberToBinnary {

	public static void main(String[] args) {
		// 1.
		Integer count = 10;
		String numToBinary = Integer.toBinaryString(count);

		System.out.println(numToBinary);

		// 2. replace the binary number of '0' and '1' to any number/character/...etc

		System.out.println("Enter the Number:-");

		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();

		String numBinary = Integer.toBinaryString(num);

		String replace = numBinary.replace('0', 'd');
		
		

		System.out.println(replace);

	}
}
