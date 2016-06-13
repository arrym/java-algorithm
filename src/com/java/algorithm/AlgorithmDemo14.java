package com.java.algorithm;

import java.util.Scanner;

import org.junit.Test;


/**
 * 判断一个数是否是素数（只能被1和自己整除的数）
 * 
 * @author soul
 * @version v1.0 2014-11-174
 */
public class AlgorithmDemo14 {
	public static void main(String[] args) {
		int n = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		n = scanner.nextInt();
		if(test(n)){
			System.out.println(n + "是素数");
		}else{
			System.out.println(n + "不是素数");
		}
	}
	
	public static boolean test(int n){
		int i = 2;
		int flage = 0;
		boolean result = false;
		while(flage == 0 && i < n){
			if(n % i == 0){
				flage = 1;
			}else{
				i ++;
			}
			if(flage == 0){
				result = true;
			}else{
				result = false;
			}
		}
		return result;
	}
}
