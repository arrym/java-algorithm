package com.java.clist;

/**
 * 节点类
 * 对链表的操作就是对节点进行增删改查操作。
 * @author soul
 * @version v1.0 2014-11-20
 */
public class ListNode {
	// 下一个节点的引用
	public ListNode next;
	//当前节点的值
	public int value;

	public ListNode(int newValue) {
		value = newValue;
	}
}
