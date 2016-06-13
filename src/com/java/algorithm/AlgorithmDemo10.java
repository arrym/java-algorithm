package com.java.algorithm;

import org.junit.Test;

/**
 * 排序算法
 * 
 * 算法 大O表示法表示的运行时间 线性查找 O(N) 二分查找 O(logN) 无序数组的插入 O(1) 有序数组的插入 O(N) 无序数组的删除 O(N)
 * 有序数组的删除 O(N) O(1)是最优秀的,O(logN)良好,O(N)还可以,O(N2)稍差(在冒泡法中见到)
 * 
 * 
 * @author soul
 * @version v1.0 2014-11-14
 */
public class AlgorithmDemo10 {
    /**
     * 冒泡排序
     * 
     * @param arrayInt
     * 
     */
    private static void bubbleSort(int[] arrayInt) {
	for (int i = 0; i < arrayInt.length - 1; i++) {
	    for (int j = 0; j < arrayInt.length - i - 1; j++) {
		if (arrayInt[1 + j] > arrayInt[j]) {
		    int temp = arrayInt[j];
		    arrayInt[j] = arrayInt[j + 1];
		    arrayInt[j + 1] = temp;
		}
	    }
	}
    }

    public static void main(String[] args) {
	int[] arr = { 5, 21, 34, 4, 15, 26, 97, 18, 9 };
	bubbleSort(arr);
	for (int i = 0; i < arr.length; i++) {
	    System.out.print(arr[i] + " ");
	}
    }

    /**
     * 冒泡排序
     * 
     * @param in
     */
    public void efferArray(Integer[] in) {
	int tem = 0;
	int num = 0;
	int upnum = 0;

	for (int i = 0; i < in.length - 1; i++) {
	    for (int j = in.length - 1; j > i; j--) {
		num++;
		if (in[j] < in[j - 1]) {
		    tem = in[j - 1];
		    in[j - 1] = in[j];
		    in[j] = tem;
		    upnum++;
		}
	    }
	}

	for (int i = 0; i < in.length; i++) {
	    System.out.print(in[i]);
	    if (i < in.length - 1) {
		System.out.print(",");
	    }
	}
	System.out.println();
	System.out.println("冒泡排序循环次数:" + num);
	System.out.println("移动次数：" + upnum);
	System.out.print("\n\n\n");
    }

    @Test
    public void test00() {
	for (int i = 1, count = 0; i < 100; i++) {
	    if (i % 3 == 0) {
		System.out.println(i);
		if (count++ >= 10) {
		    break;
		}
	    }
	}
    }

    /**
     * 冒泡排序二
     */
    public void bubblesort2(int[] arrayInt) {
	for (int i = 0; i < arrayInt.length; i++) {
	    // 相邻元素两两比较，然后按照大小交换位置
	    if (arrayInt[i] > arrayInt[i + 1]) {
		int temp = arrayInt[i];
		arrayInt[i] = arrayInt[i + 1];
		arrayInt[i + 1] = arrayInt[i];
	    }
	}
    }

    /**
     * 快速排序
     * 
     * @param arrayInt
     *            要排序的数组
     * @param low
     *            低
     * @param high
     *            高
     */
    private static void quickSort(int[] arrayInt, int low, int high) {
	int i, j, temp;

	if (low < high) {
	    i = low;
	    j = high;
	    // temp作为标准数据元素
	    temp = arrayInt[i];

	    while (i < j) {
		while (i < j && arrayInt[j] > temp) {
		    j--;
		}
		// 从数组的右端扫描，并与标准数据元素temp比较，如果a[j]>temp, 数据位置不变，继
		// 续向左端扫描
		if (i < j) {
		    // 数据元素a[j]<temp, 则与a[i] 交换, 使小于temp的元素在temp的左边，并把i值
		    // 加1，并从数组的左端向右端扫描
		    arrayInt[i] = arrayInt[j];
		    i++;
		}
		while (i < j && arrayInt[i] < temp) {
		    i++;
		}
		// 数组的左端向右端扫描
		if (i < j) {
		    arrayInt[j] = arrayInt[i];
		    j--;
		    // 数据元素a[i]>emp, 则与a[j] 交换, 使大于temp的元素在temp的右边边， 并把j 值
		    // 减1，并从数组的由端向左端扫
		    arrayInt[i] = arrayInt[j];
		}
	    }
	    arrayInt[i] = temp;
	    // 对左端递归
	    quickSort(arrayInt, low, i - 1);
	    // 对右端递归
	    quickSort(arrayInt, i + 1, high);
	}
    }

    /**
     * 选择排序
     * 
     * @param args
     */
    private static void chooseSort(int[] a) {
	for (int i = 0; i < a.length; i++) {
	    int k = i;
	    for (int j = i + 1; j < a.length; j++) {
		if (a[j] < a[k]) {
		    k = j;
		}
		if (i != k) {
		    int temp = a[i];
		    a[i] = a[k];
		    a[k] = temp;
		}
	    }
	}
    }

    /**
     * 选择排序
     * 
     * @param in
     */
    public void chooseArray(Integer[] in) {
	int tem = 0;
	int num = 0;
	int upnum = 0;
	for (int i = 0; i < in.length; i++) {
	    for (int j = i; j < in.length - 1; j++) {
		num++;
		if (in[j + 1] < in[j]) {
		    tem = in[j + 1];
		    in[j + 1] = in[j];
		    in[j] = tem;
		    upnum++;
		}
	    }
	}

	for (int i = 0; i < in.length; i++) {
	    System.out.print(in[i]);
	    if (i < in.length - 1) {
		System.out.print(",");
	    }
	}
	System.out.println();
	System.out.println("选择排序循环次数:" + num);
	System.out.println("移动次数：" + upnum);
	System.out.print("\n\n\n");
    }

    /**
     * 直接插入排序
     * 
     * @param args
     */
    private static int[] sortAscending(int[] with) {
	int length = with.length;
	int[] temp = new int[length];
	temp[0] = with[0];
	for (int i = 1; i < length; i++) {
	    for (int j = i - 1; j >= temp[j]; j--) {
		if (with[i] >= temp[j]) {
		    temp[j + 1] = with[i];
		    break;
		} else {
		    temp[j + 1] = temp[j];
		    if (j == 0) {
			temp[i] = with[i];
		    }
		}
	    }
	}
	return temp;
    }

    /**
     * 插入排序
     */
    public void insertArray(Integer[] in) {
	int temp = 0;
	int num = 0;
	int upnum = 0;
	for (int i = 0; i < in.length; i++) {
	    for (int j = i - 1; j >= 0; j--) {
		num++;
		if (in[j + 1] < in[j]) {
		    temp = in[j + 1];
		    in[j + 1] = in[j];
		    in[j] = temp;
		    upnum++;
		} else {
		    break;
		}
	    }
	}
	for (int i = 0; i < in.length; i++) {
	    System.out.print(in[i]);
	    if (i < in.length - 1) {
		System.out.print(",");
	    }
	}
	System.out.println();
	System.out.println("插入排序循环的次数为：" + num);
	System.out.println("移动次数为：" + upnum);
    }

    @Test
    public void testInsertArray() {
	Integer[] in = { 12, 52, 10, 1, 26, 3, 19, 47 };
	insertArray(in);
    }

    @Test
    public void test03() {
	int[] data = new int[] { 43, 12, 32, 55, 33, 67, 54, 65, 43, 22, 66,
		98, 74 };
	QuickSort_1 sort = new QuickSort_1(data);
	sort.display();
	sort.quickSort();
	sort.display();
    }

    @Test
    public void test04() {
	int num[] = { 546, 87, 21, 3124, 65, 2, 9, 3, 213, 54, 98, 23, 6, 4, 7,
		8, 123, 872, 61, 5, 8954 };
	shellArray(num);
	for (int i = 0; i < num.length; i++) {
	    System.out.println(num[i]);
	}
    }

    /**
     * 希尔排序 间隔序列：h = 3 * h + 1，h=(h-1)/3
     * 
     * @param num
     */
    public void shellArray(int[] num) {
	int i = 1;
	int tem, in;
	for (; i < num.length / 3;) {
	    i = 3 * i + 1;
	}
	for (; i >= 1;) {
	    for (int j = i; j < num.length; j++) {
		tem = num[j];
		in = j;
		while (in > i - 1 && num[in - i] >= tem) {
		    num[in] = num[in - i];
		    in = in - i;
		}
		num[in] = tem;
	    }
	    i = (i - 1) / 3;
	}
    }

}

/**
 * 归并排序，要求待排序的数组必须实现Comparable接口
 */
// class MergeSort implements SortStrategy {
// private Comparable[] bridge;
//
// /**
// * 利用归并排序算法对数组obj进行排序
// */
// public void sort(Comparable[] obj) {
// if (obj == null) {
// throw new NullPointerException("The param can not be null!");
// }
// bridge = new Comparable[obj.length]; // 初始化中间数组
// mergeSort(obj, 0, obj.length - 1); // 归并排序
// bridge = null;
// }
//
// /**
// * 将下标从left到right的数组进行归并排序
// *
// * @param obj
// * 要排序的数组的句柄
// * @param left
// * 要排序的数组的第一个元素下标
// * @param right
// * 要排序的数组的最后一个元素的下标
// */
// private void mergeSort(Comparable[] obj, int left, int right) {
// if (left < right) {
// int center = (left + right) / 2;
// mergeSort(obj, left, center);
// mergeSort(obj, center + 1, right);
// merge(obj, left, center, right);
// }
// }
//
// /**
// * 将两个对象数组进行归并，并使归并后为升序。归并前两个数组分别有序
// *
// * @param obj
// * 对象数组的句柄
// * @param left
// * 左数组的第一个元素的下标
// * @param center
// * 左数组的最后一个元素的下标
// * @param right
// * 右数组的最后一个元素的下标
// */
// private void merge(Comparable[] obj, int left, int center, int right) {
// int mid = center + 1;
// int third = left;
// int tmp = left;
// while (left <= center && mid <= right) { // 从两个数组中取出小的放入中间数组
// if (obj[left].compareTo(obj[mid]) <= 0) {
// bridge[third++] = obj[left++];
// } else
// bridge[third++] = obj[mid++];
// }
// // 剩余部分依次置入中间数组
// while (mid <= right) {
// bridge[third++] = obj[mid++];
// }
// while (left <= center) {
// bridge[third++] = obj[left++];
// }
// // 将中间数组的内容拷贝回原数组
// copy(obj, tmp, right);
// }
//
// /**
// * 将中间数组bridge中的内容拷贝到原数组中
// *
// * @param obj
// * 原数组的句柄
// * @param left
// * 要拷贝的第一个元素的下标
// * @param right
// * 要拷贝的最后一个元素的下标
// */
// private void copy(Comparable[] obj, int left, int right) {
// while (left <= right) {
// obj[left] = bridge[left];
// left++;
// }
// }
// }
/**
 * 快速排序
 * 
 * @author soul
 * 
 */
class QuickSort_1 {
    private int[] data;

    QuickSort_1(int[] data) {
	this.data = data;
    }

    public void quickSort() {
	recQuickSort(data, 0, data.length - 1);
    }

    private void recQuickSort(int[] data, int low, int high) {
	// 设置两个滑标
	int lowCursor = low + 1;
	int highCursor = high;

	// 交换时的临时变量
	int temp = 0;
	// 比较枢值,设为数组的第一个值
	int medi = data[low];

	while (true) {
	    // 从低端开始查找，确定大于数 data[low] 所在的位置
	    while (lowCursor < high && data[lowCursor] < medi) {
		lowCursor++;
	    }

	    // 从高端开始查找，确定小于数 data[low] 所在的位置。这里要使用 >= 判断确定小于值
	    while (highCursor > low && data[highCursor] >= medi) {
		highCursor--;
	    }

	    // 两游标位置出现越界，退出循环
	    if (lowCursor >= highCursor) {
		break;
	    }

	    // 交换 data[highCursor] 和 data[lowCursor] 位置数据
	    temp = data[highCursor];
	    data[highCursor] = data[lowCursor];
	    data[lowCursor] = temp;
	}

	// 由 while 循环退出条件可知：lowCursor > highCursor
	// 当前 lowCursor 指向右侧大于 data[low]的第一个位置;
	// 而 highCursor 指向左侧小于 data[low]的第一个位置，所以需要交换 data[low] 和
	// data[highCursor]的值
	data[low] = data[highCursor];
	data[highCursor] = medi;

	// 递归运算左半部分
	if (low < highCursor) {
	    recQuickSort(data, low, highCursor);
	}

	// 递归运算右半部分
	if (lowCursor < high) {
	    recQuickSort(data, lowCursor, high);
	}
    }

    public void display() {
	for (int i = 0; i < data.length; i++) {
	    System.out.print(data[i] + " ");
	}
	System.out.println();
    }
}
