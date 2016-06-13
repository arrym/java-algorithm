package com.java.algorithm;

import java.util.Scanner;

import org.junit.Test;

/**
 * 题目：给一个不多于5位的正整数，
 * 要求：一、求它是几位数，
 * 二、逆序打印出各位数字。
 * 
 * @author soul
 * 
 */
public class AlgorithmDemo05 {
	
	@Test
	public void test(){
		
		Scanner  scanner = new Scanner(System.in);
		System.out.println("请输入数字：");
		long s = scanner.nextLong();
		
		String str = Long.toString(s);
		System.out.println("位数为：" + str.length());
		
		char[] ch = str.toCharArray();
		for(int i = ch.length - 1 ; i >= 0; i--){
			System.out.print(ch[i]);
		}
	}
}
