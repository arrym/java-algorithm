package com.java.algorithm;

/**
 * 二分查找
 * 
 * @author soul
 * @version v1.0 2014-11-14
 */
public class AlgorithmDemo09 {
	/**
	 * 二分查找
	 * @param dataset 已经排好序的数组
	 * @param data 要查找的数
	 * @return 返回该数的位置
	 */
	public static int binarySearch(int[] dataset, int data) {
		// 起始位置
		int beginIndex = 0;
		// 结束位置
		int endIndex = dataset.length - 1;
		// 中点
		int midIndex = -1;
		// 根据第一个元素和最后一个元素判断数据是否在数组中
		if (data < dataset[beginIndex] || data > dataset[endIndex]
				|| beginIndex > endIndex) {
			return -1;
		} 
		while(beginIndex <= endIndex){
			//初始化中点
			midIndex = (beginIndex + endIndex)/2;
			//如果该数小于数组的中点数
			if (data < dataset[midIndex]) {
				//把查找的终点改为在中点
				endIndex = midIndex - 1;
			}else if(data > dataset[midIndex]){
				beginIndex = midIndex + 1;
			}else{
				return midIndex;
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		int[] test1 = {12,34,40,45,53,60,62,70,73,75,89};
		System.out.println("你查找的数据位置在：" + AlgorithmDemo09 .binarySearch(test1, 45));
	}
}
