package com.java.algorithm;

/**
 * 循环查找
 * 搜寻的目的，是在「已排序的资料」中寻找指定的资料，而当中循序搜寻是最基本的搜寻法，
 * 只要从资料开头寻找到最后，看看是否找到资料即可。
 * @author soul
 * @version v1.0 2014-11-16
 */
public class LinearSearch {
	public static int search(int[] number, int des) {
		int[] tmp = new int[number.length + 1];
		for(int i = 1; i < tmp.length; i++) {
			tmp[i] = number[i-1];
		}
		tmp[0] = des;
		int k = tmp[0];
		int i = number.length;
		while(tmp[i] != k)
		    i--;
		return i - 1;
	}
	public static void main(String[] args) {
		int[] number = {1, 4, 2, 6, 7, 3, 9, 8};
		QuickSort.sort(number);
		int find = LinearSearch.search(number, 3);
		if(find != 0)
		    System.out.println("找到数值于索引" + find);
		else
		    System.out.println("找不到数值");
	}
} 

