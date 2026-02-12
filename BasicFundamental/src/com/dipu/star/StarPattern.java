package com.dipu.star;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		System.out.println("Enter Print Star(*) rows and equal column");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
