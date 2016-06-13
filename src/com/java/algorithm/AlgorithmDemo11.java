package com.java.algorithm;

/**
 * 公鸡5元一只，母鸡3元一只，小鸡一元三只，100元如何买100只鸡？
 * 
 * @author soul
 * @version v1.0 2014-11-14
 */
public class AlgorithmDemo11 {
	public static void main(String[] args) {
		int[] a = buy();
		System.out.println("可以买" + a[0] + "只公鸡");
		System.out.println("可以买" + a[1] + "只母鸡");
		System.out.println("可以买" + a[2] + "只小鸡");
	}
	
	public static int[] buy(){
		int[] sum = new int[3];
		int x = 0;
		int y = 0;
		int z = 0;
		for(x = 0; x < 19; x++){  //最多能买20只公鸡
			for(y = 0; y < 33; y++){  //最多能买33只母鸡
				z = 100 - x - y;   //本来最多能买300只小鸡，但是规定100只，所以最多能买100只小鸡
				int p;
				p = z%3; //剩下可以买小鸡的钱
				if(((5*x+3*y+z/3)==100)&&(p==0)){ //如果三者的钱数之和为100，且没有余额则就是结果
					sum[0] = x;
					sum[1] = y;
					sum[2] = z;
				}
			}
		}
		return sum;
	}
}
