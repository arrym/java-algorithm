package com.java.algorithm;

import java.util.Scanner;

import org.junit.Test;

/**
 * 题目：一个5位数，判断它是不是回文数。
 * 即12321是回文数，个位与万位相同，十位与千位相同。  
 * @author soul
 *
 */
public class AlgorithmDemo06 {
	
	@Test
	public void test(){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("五位数：");
		long s = scanner.nextLong();
		
		String str = Long.toString(s);
		char[] ch = str.toCharArray();
		if(ch[0]==ch[4] && ch[1] == ch[3]){
			System.out.println(s + "是回文数");
		}else{
			System.out.println(s + "不是回文数");
		}
	}
}