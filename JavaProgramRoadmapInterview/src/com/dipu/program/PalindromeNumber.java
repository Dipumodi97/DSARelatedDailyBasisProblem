package com.dipu.program;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		String str = "madam";
		
		String reversed = new StringBuilder(str).reverse().toString();
		
		//System.out.println(str.equals(reversed));
		if (str.equals(reversed)) {
			System.out.println(str+" is Palindrome Number");
		}else {
			System.out.println(str + " is not a Palindrome Number");
		}
	}
}
