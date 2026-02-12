package com.dipu.search;

public class SearchTree {
	
	public static void main(String[] args) {
		int[] arr = {20,-5,6,47,56,67};
		boolean search = findSearchNumber(arr,6,-8);
		System.out.println(search);
		
		int max = findMax(arr,6);
		System.out.println(max);
		
		int min = findMin(arr,6);
		System.out.println(min);
	}

	private static int findMin(int[] arr, int n) {
		int min = arr[0];
		
		for (int i = 0; i <n; i++) {
			if (min>arr[i]) {
				min = arr[i];
			}
			
		}
		return min;
	}

	private static int findMax(int[] arr, int n) {
		int max =0;
		for (int i = 0; i < n; i++) {
			if (max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}

	private static boolean findSearchNumber(int[] arr, int n, int key) {
		for (int i = 0; i < n; i++) {
			if(arr[i]==key) {
				return true;
			}
		}
		return false;
	}

}
