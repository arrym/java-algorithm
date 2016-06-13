package com.java.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 
 输入一个只含有数字的字符串。输出其中出现频率最高的那个数字，格式为“数字+逗号+个数”。
 * 
 * @author soul
 * 
 */
public class Demo {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	// 把数组存到链表
	List<String> list = new ArrayList<String>();
	for (int i = 0; i < s.length(); i++) {
	    list.add(s.charAt(i) + "");
	}
	System.out.println(list);

	int[] count = new int[list.size()];
	for (int i = 0; i < count.length; i++) {
	    count[i] = 1;
	}
	System.out.println(Arrays.toString(count));

	for (int i = 0; i < list.size(); i++) {
	    for (int j = i + 1; j < list.size(); j++) {
		if (list.get(i).equals(list.get(j))) {
		    list.remove(j);
		    j--;
		    count[i]++;
		}
	    }
	}
	System.out.println(list);
	System.out.println(Arrays.toString(count));

	int max = count[0];
	String maxStr = "";
	for (int i = 0; i < count.length; i++) {
	    if (max <= count[i]) {
		max = count[i];
		maxStr = list.get(i);
	    }
	}

	System.out.println("出现次数最多的数字是" + maxStr + "," + "出现的次数是" + max);
    }
}
