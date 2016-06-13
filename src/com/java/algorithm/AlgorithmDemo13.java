package com.java.algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import org.junit.Test;

/**
 * 求指定项数的斐波那契数列
 * 
 * @author soul
 * @version v1.0 2014-11-14
 */
public class AlgorithmDemo13 {
	/**
	 * 非递归实现斐波那契数列算法
	 * 
	 * @param n
	 * @return
	 */
	public Collection<Integer> test(int n) {
		int f1 = 1;
		int f2 = 1;
		int i = 2;
		Collection<Integer> result = new ArrayList<>();
		if (n == 1) {
			result.add(f1);
		}
		if (n == 2) {
			result.add(f1);
			result.add(f2);
		}
		if (n > 2) {
			result.add(f1);
			result.add(f2);
			while (n > i) {
				f1 = f2 + f1;
				result.add(f1);
				i++;
				f2 = f2 + f1;
				result.add(f2);
			}
		}
		return result;
	}

	@Test
	public void test1() {
		int n = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		n = scanner.nextInt();
		Collection<Integer> result = test(n);
		Iterator<Integer> iterator = result.iterator();
		System.out.println("你所指定的项的斐波那契数列为：");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

	/**
	 * 递归实现斐波那契数列算法
	 */
	public int fib(int n) {
		if (n < 2) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}

	@Test
	public void test2() {
		int n = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		n = scanner.nextInt();
		System.out.println("你所指定的项的斐波那契数列为：");
		for (int i = 1; i <= n; i++) {
			System.out.print(fib(i) + " ");
		}
	}

	/**
	 * 动态递归实现斐波那契数列算法
	 */
	public int fib_1(int n) {
		if (n < 2) {
			return n;
		}

		int[] f = new int[n];

		f[0] = 0;
		f[1] = 1;
		//使用循环来保存先前计算的结果
		for (int i = 2; i < n; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[n - 1] + f[n - 2];
	}

	@Test
	public void test3() {
		int n = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		n = scanner.nextInt();
		System.out.println("你所指定的项的斐波那契数列为：");
		for (int i = 1; i <= n; i++) {
			System.out.print(fib_1(i) + " ");
		}
	}
}
