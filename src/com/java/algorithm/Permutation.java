package com.java.algorithm;
/**
 * 将一组数字、字母或符号进行排列，以得到不同的组合顺序，
 * 例如1 2 3这三个数的排列组合有：1 2 3、1 3 2、2 1 3、2 3 1、3 1 2、3 2 1。
 * @author soul
 *
 */
public class Permutation {
	public static void perm(int[] num, int i) {
		if (i < num.length - 1) {
			for (int j = i; j <= num.length - 1; j++) {
				int tmp = num[j];
				// 旋转该区段最右边数字至最左边
				for (int k = j; k > i; k--)
					num[k] = num[k - 1];
				num[i] = tmp;
				perm(num, i + 1);
				// 还原
				for (int k = i; k < j; k++)
					num[k] = num[k + 1];
				num[j] = tmp;
			}
		} else {
			// 显示此次排列
			for (int j = 1; j <= num.length - 1; j++)
				System.out.print(num[j] + " ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[] num = new int[4 + 1];
		for (int i = 1; i <= num.length - 1; i++)
			num[i] = i;
		perm(num, 1);
	}
}