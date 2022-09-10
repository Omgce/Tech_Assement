package com.op;

public class Sum_of_All_Subset_XOR_Totals {

	static int allXor(int nums[], int len) {
		int bits = 0;
		for (int i = 0; i < len; i++)
			bits |= nums[i];
		int sum = bits * (int) Math.pow(2, len - 1);
		return sum;
	}

	public static void main(String[] args) {
		int nums[] = { 5,1,6 };
		int n = nums.length;
		System.out.println("Sum of All Subset XOR Totals : " + allXor(nums, n));
	}
}
