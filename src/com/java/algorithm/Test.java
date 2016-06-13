package com.java.algorithm;

import java.util.Random;

/**
 * 面试题
 * 
 * @author soul
 * 
 */
class Value {
    public int i = 15;
}

public class Test {
    // public static void main(String[] args) {
    // Test t = new Test();
    // t.first();
    // System.out.println(boolean.class.equals(Boolean.TYPE));

    // }

    static String upcase(String s) {
	s = s.toUpperCase();
	return s;
    }

    // public static void main(String[] args) {
    // long s = System.currentTimeMillis();
    // String q = new String("howdy");
    // long e = System.currentTimeMillis();
    // System.out.println(e - s); // howdy
    // }

    public void first() {
	int i = 5;
	Value v = new Value();
	v.i = 25;
	sec(v, i);
	System.out.println(v.i);
    }

    public void sec(Value v, int i) {
	i = 0;
	v.i = 20;
	Value va = new Value();
	v = va;
	System.out.println(v.i + " " + i);
    }

    public static void main(String[] args) {
	int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
		17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32,
		33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48,
		49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64,
		65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
		81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96,
		97, 98, 99, 100 };
	int[] r = a(arr);
	for (int i = 0; i < r.length; i++) {
	    System.out.print(r[i] + " ");
	}
    }

    public static int[] a(int[] arr) {
	boolean[] b = new boolean[arr.length];
	int[] ar = new int[10];
	int i = 0;
	Random ran = new Random();
	for (int j = 0; j < ar.length; j++) {
	    do {
		i = ran.nextInt(arr.length);
	    } while (b[i]);
	    ar[j] = arr[i];
	    b[i] = true;
	}
	return ar;
    }
}
