package com.java.algorithm;
/**
 *「基数排序法」（radix sort）是属于「分配式排序」（distribution sort），
 * 基数排序法又称「桶子法」（bucket sort）或bin sort，顾名思义，它是透过键值的部份资讯，
 * 将要排序的元素分配至某些「桶」中，藉以达到排序的作用，基数排序法是属于稳定性的排序，
 * 其时间复杂度为O (nlog(r)m)，其中r为所采取的基数，而m为堆数，在某些时候，基数排序法的效率
 * 高于其它的比较性排序法。
 * @author soul
 *
 */
public class RadixSort {
	public static void sort(int[] number, int d) {
		int k = 0;
		int n = 1;
		int[][] temp = new int[number.length][number.length];
		int[] order = new int[number.length];
		while (n <= d) {
			for (int i = 0; i < number.length; i++) {
				int lsd = ((number[i] / n) % 10);
				temp[lsd][order[lsd]] = number[i];
				order[lsd]++;
			}
			for (int i = 0; i < number.length; i++) {
				if (order[i] != 0)
					for (int j = 0; j < order[i]; j++) {
						number[k] = temp[i][j];
						k++;
					}
				order[i] = 0;
			}
			n *= 10;
			k = 0;
		}
	}
	public static void main(String[] args) {
		int[] data = {73, 22, 93, 43, 55, 14, 28, 65, 39, 81, 33, 100};
		RadixSort.sort(data, 100);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}
}
