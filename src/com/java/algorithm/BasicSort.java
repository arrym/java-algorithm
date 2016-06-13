package com.java.algorithm;
/**
 * 选择排序（Selection sort）、插入排序（Insertion sort）与气泡排序（Bubble sort）
 * 这三个排序方式是初学排序所必须知道的三个基本排序方式，它们由于速度不快而不实用（平均与
 * 最快的时间复杂度都是O(n2)），然而它们排序的方式确是值得观察与探讨的。
 * @author soul
 *
 */
public class BasicSort {
	/**
	 * 选择排序 
	 * 将要排序的对象分作两部份，一个是已排序的，一个是未排序的，
	 * 从后端未排序部份选择一个最小值，并放入前端已排序部份的最后一个.
	 * 
	 * @param number
	 */
	public static void selectionSort(int[] number) {
		for (int i = 0; i < number.length - 1; i++) {
			int m = i;
			for (int j = i + 1; j < number.length; j++)
				if (number[j] < number[m])
					m = j;
			if (i != m)
				swap(number, i, m);
		}
	}
	/**
	 * 插入排序 
	 * 像是玩朴克一样，我们将牌分作两堆，每次从后面一堆的牌抽出最前端的牌，
	 * 然后插入前面一堆牌的适当位置
	 * 
	 * @param number
	 */
	public static void injectionSort(int[] number) {
		for (int j = 1; j < number.length; j++) {
			int tmp = number[j];
			int i = j - 1;
			while (tmp < number[i]) {
				number[i + 1] = number[i];
				i--;
				if (i == -1)
					break;
			}
			number[i + 1] = tmp;
		}
	}
	/**
	 * 气泡排序法 
	 * 顾名思义，就是排序时，最大的元素会如同气泡一样移至右端，其利用比较相邻元素的方法，
	 * 将大的元素交换至右端，所以大的元素会不断的往右移动，直到适当的位置为止。
	 * 
	 * @param number
	 */
	public static void bubbleSort(int[] number) {
		boolean flag = true;
		for (int i = 0; i < number.length - 1 && flag; i++) {
			flag = false;
			for (int j = 0; j < number.length - i - 1; j++) {
				if (number[j + 1] < number[j]) {
					swap(number, j + 1, j);
					flag = true;
				}
			}
		}
	}
	private static void swap(int[] number, int i, int j) {
		int t;
		t = number[i];
		number[i] = number[j];
		number[j] = t;
	}
	public static void main(String[] args) {
		// 测试：
		int[] a = {10, 9, 1, 100, 20, 200, 39, 45, 23, 18, 2, 2, 15};
		// 测试选择排序：
		System.out.println("选择排序前：");
		for (int x : a)
			System.out.print(x + " ");
		System.out.println();
		int[] b = new int[a.length];
		b = a;
		selectionSort(b);
		System.out.println("选择排序后：");
		for (int x : b)
			System.out.print(x + " ");
		System.out.println();
		// 测试插入排序：
		System.out.println("插入排序前：");
		for (int x : a)
			System.out.print(x + " ");
		System.out.println();
		int[] c = new int[a.length];
		c = a;
		injectionSort(c);
		System.out.println("插入排序后：");
		for (int x : c)
			System.out.print(x + " ");
		System.out.println();
		// 测试气泡排序：
		System.out.println("气泡排序前：");
		for (int x : a)
			System.out.print(x + " ");
		System.out.println();
		int[] d = new int[a.length];
		d = a;
		bubbleSort(d);
		System.out.println("气泡排序后：");
		for (int x : d)
			System.out.print(x + " ");
	}
}
