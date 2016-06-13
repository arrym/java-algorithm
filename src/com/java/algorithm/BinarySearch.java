package com.java.algorithm;

/**
 * 二分查找（适合数据量较小的查找）
 * 如果搜寻的数列已经有排序，应该尽量利用它们已排序的特性，以减少搜寻比对的次数，
 * 这是搜寻的基本原则，二分搜寻法是这个基本原则的代表。
 * @author soul
 * @version v1.0 2014-11-16
 */
public class BinarySearch {

	public static int search(int[] number, int des) {

		int low = 0;
		int upper = number.length - 1;

		while (low <= upper) {
			int mid = (low + upper) / 2;
			if (number[mid] < des) {
				low = mid + 1;
			} else if (number[mid] > des) {
				upper = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] number = { 1213, 343, 5645623, 667, 64, 3, 87, 23, 2 };
		QuickSort.sort(number);

		int find = search(number, 64);
		if (find != -1) {
			System.out.println("搜索的数下标为：" + find);
		} else {
			System.out.println("没有该数！");
		}
	}
}
