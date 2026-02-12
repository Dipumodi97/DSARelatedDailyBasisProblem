package com.dipu.interview;

import java.util.Arrays;

public class RotateArray {

	public static void rotate(int[] nums, int k) {
		if (k > nums.length)
			k = k % nums.length;

		int[] result = new int[nums.length];

		for (int i = 0; i < k; i++) {
			result[i] = nums[nums.length - k + i];
		}

		int j = 0;

		for (int i = k; i < nums.length; i++) {
			result[i] = nums[j];
			j++;
		}
		System.arraycopy(result, 0, nums, 0, nums.length);
	}

	public static void main(String[] args) {
		// RotateArray ra = new RotateArray();

		int[] nums = { 5, 6, 8, 7, 9, 6, 3 };
		int k = 3;
		rotate(nums, k);

		System.out.print("[");
		boolean first = true;
		for (int n : nums) {
			if (!first) {
				System.out.print(",");
			}
			System.out.print(n + " ");
			first = false;
		}
		System.out.println("]");
		
		System.out.print("[");
		for (int n : nums) {
			System.out.print(n + " ");
			System.out.print(",");
		}
		System.out.println("]");

		System.out.print(Arrays.toString(nums));
	}
}
