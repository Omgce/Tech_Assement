package com.op;

import java.util.LinkedList;

public class Leader_in_the_Array {

	void print(int arr[], int len) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(arr[len - 1]);

		for (int i = len - 2; i >= 0; i--) {
			if (arr[i] > list.getFirst())
				list.push(arr[i]);
		}
		while (!list.isEmpty()) {
			System.out.print(list.getFirst() + " ");
			list.remove();
		}
	}

	public static void main(String[] args) {
		Leader_in_the_Array l = new Leader_in_the_Array();
		int arr[] = new int[] { 7, 10, 4, 10, 6, 5, 2 };
		int n = arr.length;
		l.print(arr, n);
	}
}
