package com.java.algorithm;

import java.util.Scanner;

/**
 * 网格布局城市间遍历所有城市之最短路径
 * 
 * @author soul
 * 
 */
public class ShortestPath {

    public static void main(String args[]) {
	int iCase;
	Scanner input = new Scanner(System.in);
	System.out.println("请输入测试列数：");

	iCase = input.nextInt();
	// System.out.println("输出列数"+iCase);
	int number;
	for (number = 1; number < iCase; number++) {
	    int m, n;
	    m = input.nextInt();
	    n = input.nextInt();
	    System.out.println(number);
	    System.out.println(m * n);
	    if (m % 2 == 1 && n % 2 == 1)
		System.out.println("41");
	    else
		System.out.println("00");
	}

    }
}