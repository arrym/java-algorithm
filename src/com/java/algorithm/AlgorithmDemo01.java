package com.java.algorithm;
/**
 * 输入一个整形数组，数组里有正数和负数，数组中连续的一个或多个整数组成一个子数组，每个
 * 子数组都有一个和。求所有子数组的和的最大值，要求时间复杂度为O(n)。
 * 例如：数组[1,-2,3,10,-4,7,2,-5]和的最大的子数组为3，10，-4，7，2。
 * 因此输出为该子数组的和18
 * @author Meng
 *
 */
public class AlgorithmDemo01 {
	public static void main(String[] args) {
		
		int[] arr = new int[]{1,-2,3,10,-4,7,2,-5};
		int i = getGreatestSum(arr);
		System.out.println(i);
	}

	private static int getGreatestSum(int[] arr) {
		
		int greatestSum = 0;
		//数组为空就直接返回0
		if(arr == null || arr.length == 0){
			return 0;
		}
		int temp = greatestSum;
		//循环遍历数组，得和
		for(int i = 0; i < arr.length; i++){
			temp += arr[i];
			//如果小于0,则给临时变量赋值0
			if(temp < 0){
				temp = 0;
			}
			//如果和大于greatestSum，就调换
			if(temp > greatestSum){
				greatestSum = temp;
			}
		}
		if(greatestSum == 0){
			greatestSum = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if(greatestSum < arr[i]){
					greatestSum = arr[i];
				}
			}
		}
		return greatestSum;
	}
}
