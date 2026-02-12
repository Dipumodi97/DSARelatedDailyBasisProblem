package com.dipu.search;

public class MinMaxElement {

	public static void main(String[] args) {
		int arr[] = {25,45,27,-23,48,21};
		
		int max = findMax(arr,6);
		System.out.println(max);
		
		int min = findMin(arr,6);
		System.out.println(min);
	}

	private static int findMin(int[] arr, int n) {
		int min =arr[0];
		for (int i = 1; i < n; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		
		return min;
	}

	private static int findMax(int[] arr, int n) {
		int max =0;
		
		for (int i = 0; i < n; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}
