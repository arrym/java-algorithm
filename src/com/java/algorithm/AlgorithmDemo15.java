package com.java.algorithm;

import java.util.Scanner;

import org.junit.Test;

/**
 * 汉诺塔，现在A柱有一叠盘子，半径大的在最下面，依次向上为小盘， 现在想把所有盘子移动到C柱，A和C之间有一B柱，可以通过B柱来转移盘子，
 * 但规则是在移动的过程中必须遵守大盘在下面。一次只能移动一个盘。
 * 
 * @author soul
 * @version v1.0 2014-11-14
 */
/**
 * 每一个递归函数都有一个递归基和递归体，递归基是用于终止递归的条件，而递归体是函数调用自己的部分。
 * 
 * @author soul
 * 
 */
public class AlgorithmDemo15 {
	/**
	 * 实现
	 * 
	 * @param n
	 * @param x
	 * @param y
	 * @param z
	 */
	public void run(int n, char x, char y, char z) {
		if (n == 1) {
			System.out.println(x + "柱顶上的盘移动到" + z + "柱。");
		} else {
			run(n - 1, x, z, y);
			run(1, x, y, z);
			run(n - 1, y, x, z);
		}
	}

	@Test
	public void test1() {
		System.out.println("请输入需要移动几个盘子：");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("实现的具体步骤为：");
		run(n, 'A', 'B', 'C');
	}
	/**
	 * 编写并返回前n个整数的平方和的递归函数
	 */
	public double fib_2(int n) {
		if (n == 1 || n == 0) {
			return n;
		}
		return n * n + fib_2(n-1);
	}
	@Test
	public void test2() {
		int n = 0;
		System.out.println("请输入一个整数：");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		double sum = fib_2(n);
		System.out.println(sum);
	}
	
	/**
	 * 编写一个返回b的1到n次幂的和递归函数
	 */
	public double fib_3(double b,int n){
		if(n == 1){
			return b;
		}
		
		return Math.pow(b, n) + fib_3(b, n-1);
	}
	@Test
	public void test3(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入b：");
		double b = scanner.nextDouble();
		
		System.out.println("请输入n：");
		int  n = scanner.nextInt();
		
		double sum = fib_3(b,n);
		System.out.println("结果为：" + sum);
	}
	/**
	 * 编写一个返回数组前n个元素的和的递归函数
	 */
	public int fib_4(int[] array,int n){
		if(n == 1){
			return array[0];
		}
		
		return array[n-1] + fib_4(array, n-1);
	}
	
	@Test
	public void test4(){
		int[] array ={1,2,3,4,5,6,7,8,9,2};
		Scanner scanner = new Scanner(System.in);

		System.out.println("数组为：");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] +" ");
		}
		
		System.out.println();
		System.out.println("请输入要求前几个元素的和：");
		int n = scanner.nextInt();
		
		int sum = fib_4(array,n);
		System.out.println("数组的前" + n + "个元素的和为" + sum);
	}
}
