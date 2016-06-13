package com.java.algorithm;
/**
 * 快速排序
 * 快速排序法（quick sort）是目前所公认最快的排序方法之一（视解题的对象而定），
 * 虽然快速排序法在最差状况下可以达O(n2)，快速排序法的基本精神是在数列中找出适当的轴心，
 * 然后将数列一分为二，分别对左边与右边数列进行排序，而影响快速排序法效率的正是轴心的选择。
 * @author soul
 * @version v1.0 2014-11-16
 */
public class QuickSort {
	public static void sort(int[] number) {
		sort(number, 0, number.length - 1);
	}
	private static void sort(int[] number, int left, int right) {
		if (left < right) {
			int q = partition(number, left, right);
			sort(number, left, q - 1);
			sort(number, q + 1, right);
		}
	}
	private static int partition(int number[], int left, int right) {
		int s = number[right];
		int i = left - 1;
		for (int j = left; j < right; j++) {
			if (number[j] <= s) {
				i++;
				swap(number, i, j);
			}
		}
		swap(number, i + 1, right);
		return i + 1;
	}
	private static void swap(int[] number, int i, int j) {
		int t;
		t = number[i];
		number[i] = number[j];
		number[j] = t;
	}
}
