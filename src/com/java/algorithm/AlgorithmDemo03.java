package com.java.algorithm;

import org.junit.Test;

/**
 * 用递归求5！
 * 
 * @author soul
 * 
 */
public class AlgorithmDemo03 {
	@Test
	public void test() {
		int n = 5;
		System.out.println(rec(n));
	}
	/**
	 * 递归方法
	 * @param n
	 * @return
	 */
	public long rec(int n) {
		long value = 0;
		//先判断
		if (n == 1) {
			value = 1;
		} else {
			//再递归
			value = n * rec(n - 1);
		}
		return value;
	}
	
	@Test
	public void test01(){
		int n = 100;
		int sum = 0;
		int sum1 = 0;
		while(n > 0){
			sum += n--;
		}
		for(int i = 100; i > 0 ; i--){
			sum1 += i;
		}
		System.out.println(sum1);
		System.out.println(sum);
		System.out.println(show(100));
	}
	/**
	 * 递归求1+2+。。。+100
	 * @param n
	 * @return
	 */
	public int show(int n){
		if(n < 0){
			return 0;
		}
		return show(n-1)+n;
	}
}