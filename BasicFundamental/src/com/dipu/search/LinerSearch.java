package com.dipu.search;

public class LinerSearch {
	
	public static void main(String[] args) {
		int ar[] = {5,-4,6,5,12,15};
		boolean max = ls(ar,6,55);
		System.out.println(max);
	}

	private static boolean ls(int[] ar, int n, int key) {
		for (int i = 0; i <n; i++) {
			if (ar[i] == key) {
				return true;
			}
			
		}
		System.out.println("Key not found");
		return false;
	}

}
