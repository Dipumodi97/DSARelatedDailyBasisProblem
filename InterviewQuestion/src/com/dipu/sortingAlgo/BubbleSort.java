package com.dipu.sortingAlgo;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 1, 45, 87, 65, 3 };
		bubbleSort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		///System.out.println(arr);
		//System.out.println("Hii");
	}

	private static void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapped;

		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}

	}
}
