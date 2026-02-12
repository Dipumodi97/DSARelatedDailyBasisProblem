package com.dipu.program;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		
		int[] arr1 = {1,3,5};
		int[] arr2 = {6,9,7};
		int[] arr3 = {2,8,4};
		
		int[] merged = new int[arr1.length+arr2.length+arr3.length];
		
	     System.arraycopy(arr1, 0, merged, 0, arr1.length);
	     System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
	     System.arraycopy(arr3, 0, merged, arr2.length+arr2.length, arr3.length);
	     
	     System.out.println(Arrays.toString(merged));
	}
}
