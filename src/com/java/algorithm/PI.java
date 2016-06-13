package com.java.algorithm;
/**
 * 蒙地卡罗法求 PI 蒙地卡罗的解法适用于与面积有关的题目，例如求PI值或椭圆面积，这边介绍如何求PI值；
 * 假设有一个圆半径为1，所以四分之一圆面积就为PI，而包括此四分之一圆的正方形面积就为1，
 * 如果随意的在正方形中投射飞标（点）好了，则这些飞标（点）有些会落于四分之一圆内，假设
 * 所投射的飞标（点）有n点，在圆内的飞标（点）有c点，则依比例来算，就会得到上图中最后的公式。
 * 至于如何判断所产生的点落于圆内，很简单，令乱数产生X与Y两个数值，如果X^2+Y^2等于1就是落在圆内。
 * 
 * @author soul
 * 
 */
public class PI {
	public static void main(String[] args) {
		final int N = 50000;
		int sum = 0;
		for (int i = 1; i < N; i++) {
			double x = Math.random();
			double y = Math.random();
			if ((x * x + y * y) < 1)
				sum++;
		}
		System.out.println("PI = " + (double) 4 * sum / N);
	}
}
