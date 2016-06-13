package com.java.algorithm;

import java.util.Scanner;

import org.junit.Test;

/**
 * 题目：将一个数组逆序输出。 
 * @author soul
 *
 */
public class AlgorithmDemo08 {
	
	@Test
	public void test(){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("数组：");
		int[] a = {};
		int i = 0;
		do{
			a[i] = scanner.nextInt();
			i ++;
		}while(a[i] != -1);
		
		System.out.println("输入的数组为：");
		for(int s : a){
			System.out.print(s + " ");
		}
		System.out.println("逆序输出：");
		for(int j = a.length -1 ; j >= 0; j++){
			System.out.print(a[j] + " ");
		}
		
		
		
		
	}
}
