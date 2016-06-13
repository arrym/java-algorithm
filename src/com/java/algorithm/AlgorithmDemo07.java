package com.java.algorithm;

import org.junit.Test;

/**
 * 题目：求100之内的素数   
 * @author soul
 *
 */
public class AlgorithmDemo07 {
	
	@Test
	public void test(){
		boolean b = false;
		System.out.print(2 + " ");
		System.out.print(3 + " ");
		for(int i = 3; i < 100; i += 2){
			for(int j = 2; j < Math.sqrt(i); j++){
				if(i%j == 0){
					b = false;
					break;
				}else{
					b = true;
				}
				if(b==true){
					System.out.print(i + " ");
				}
			}
		}
	}
}
