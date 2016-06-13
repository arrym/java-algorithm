package com.java.algorithm;

/**
 * 差补查找(适合数据量较大的查找) 如果却搜寻的资料分布平均的话，
 * 可以使用插补（Interpolation）搜寻法来进行搜寻，
 * 在搜寻的对象大于500时，插补搜寻法会比 二分搜寻法 来的快速。
 * 
 * @author soul
 * @version v1.0 2014-11-16
 */
public class InterpolationSearch {
	public static int search(int[] number, int des) {
		int low = 0;
		int upper = number.length - 1;
		while (low <= upper) {
			int mid = (upper - low) * (des - number[low])
					/ (number[upper] - number[low]) + low;
			if (mid < low || mid > upper)
				return -1;
			if (des < number[mid])
				upper = mid - 1;
			else if (des > number[mid])
				low = mid + 1;
			else
				return mid;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] number = {1, 4, 2, 6, 7, 3, 9, 8};
		QuickSort.sort(number);
		int find = InterpolationSearch.search(number, 3);
		if (find != -1)
			System.out.println("找到数值于索引" + find);
		else
			System.out.println("找不到数值");
	}
}
