package com.java.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 最大公因数(GCD)使用辗转相除法来求，最小公倍数(LCM)则由这个公式来求： GCD * LCM = 两数乘积
 * 
 * @author soul
 * 
 */
public class GcdLcm {
	public static int gcdOf(int m, int n) {
		int r;
		while (n != 0) {
			r = m % n;
			m = n;
			n = r;
		}
		return m;
	}
	public static int lcmOf(int m, int n) {
		return m * n / gcdOf(m, n);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader ln = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("请输入第一个数：");
		int x = Integer.parseInt(ln.readLine());
		System.out.print("请输入第二个数：");
		int y = Integer.parseInt(ln.readLine());
		System.out
				.println("(" + x + "," + y + ")的最大公因数：" + GcdLcm.gcdOf(x, y));
		System.out
				.println("(" + x + "," + y + ")的最小公倍数：" + GcdLcm.lcmOf(x, y));
	}
}
