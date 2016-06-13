package com.java.algorithm;

import org.junit.Test;

public class AlgorithmDemo02 {
	/**
	 * 求1 + 2！+ 3! + ... + 20!
	 * 
	 * @author soul
	 * 
	 */
	@Test
	public void test() {
		long sum = 0;
		long fac = 1;
		// 循环
		for (int i = 1; i <= 20; i++) {
			fac *= i;
			sum += fac;
		}
		System.out.println("sum=" + sum);
	}

	/**
	 * 打印乘法口诀
	 */
	@Test
	public void printMulti() {
		for (int j = 1; j < 10; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print(i + " * " + j + " = " + j * i + "\t");
			}
			System.out.print("\t\n");
		}
		System.out.print("\n\n\n");
	}

	/**
	 * 打印N * 1 + N * 2 + N * 3 =num的所有组合
	 * 
	 * @param num
	 */
	public void printNumAssemble(int num) {
		for (int i = 0; i < num + 1; i++) {
			for (int j = 0; j < num / 2 + 1; j++) {
				for (int in = 0; in < num / 3 + 1; in++) {
					if (i * 1 + j * 2 + in * 3 == num) {
						System.out.println("小马" + i + ",\t中马" + j + ",\t大马"
								+ in);
					}
				}
			}
		}
	}
	@Test
	public void test01() {
		printNumAssemble(10);
	}

}
