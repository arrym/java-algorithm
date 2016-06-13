package com.java.algorithm;

/**
 * 现有不足百人排列，三人一行多一人，7人一行少两人，5人一行正好，共有多少人？
 * 
 * @author soul
 * @version v1.0 2014-11-14
 */
public class AlgorithmDemo12 {
	public static void main(String[] args) {
		System.out.println("有" + test() + "人");
	}
	
	public static int test(){
		int a = 0;
		int b = 0;
		int c = 0;
		int i ;
		for(i = 0; i < 100; i++){
			a = i % 3;
			b = i % 7;
			c = i % 5;
			if(a==1 && b == 5 && c==0){
				return i;
			}
		}
		return i;
	}
}
