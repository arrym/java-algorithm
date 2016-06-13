package com.java.algorithm;

/**
 * 8个颜色的球，大小一样，其中一个重量不一样。求出重量最大
 * 
 * @author soul
 * 
 */
public class AlgorithmDemo21 {
    public static void main(String[] args) {
	int[] is = { 2, 2, 2, 2, 3, 2, 2, 2 };
	int sum = getBig(is);
    }

    private static int getBig(int[] is) {
	int sum_1 = 0;
	int sum_2 = 0;
	boolean[] rs = new boolean[8];
//	1、分为两部分
	for(int i = 0; i < is.length; i++){
	    sum_1 += is[i];
	    if(i >= is.length/2){
		sum_2 += is[i];
	    }
	}
//	2、得到两部分中的较大值，进一步分为两部分
	if(sum_1 > sum_2){
	    sum_1 = 0;
	    sum_2 = 0;
	    for(int i = 0; i < is.length/2 ; i++){
		sum_1 += is[i];
		rs[i] = true;
		if(i >= is.length/4){
		    sum_2 += is[i];
		    rs[i] = true;
		}
	    }
	}else{
	    sum_1 = 0;
	    sum_2 = 0;
	    for(int i = is.length/2; i < is.length ; i++){
		sum_1 += is[i];
		rs[i] = true;
		if(i >= is.length*3/4){
		    sum_2 += is[i];
		    rs[i] = true;
		}
	    }
	}
	
	if(sum_1 > sum_2){
	    sum_1 = is[0];
	    sum_2 = is[1];
	}else{
	    sum_1 = 
	}
	return 0;
    }
}
