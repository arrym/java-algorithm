package com.java.clist;

/**
 * 单向链表
 * 
 * @author soul
 * @version v1.0 2014-11-20
 */
public class Clist {

	private ListNode head;
	private ListNode tail;
	private ListNode current;
	private int listCountValue;

	public Clist() {
		listCountValue = 0;
		head = null;
		tail = null;
	}

	public void append(int dataValue) {
		ListNode newNode = new ListNode(dataValue);
		if (listCountValue == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		current = newNode;
		listCountValue += 1;
	}

	public void insert(int dataValue) {
		ListNode newNode = new ListNode(dataValue);
		if (listCountValue == 0) {
			append(dataValue);
			return;
		}
		if (current == head) {
			newNode.next = head;
			head = newNode;
			current = tail;
			listCountValue += 1;
		}
		if ((current != head) && (current != tail)) {
			newNode.next = current.next;
			current.next = newNode;
			current = newNode;
			listCountValue += 1;
		}
	}

	public void delete() {
		if (listCountValue != 0) {
			head = current.next;
			current = head;
			listCountValue -= 1;
			return;
		} else {
			current = current.next;
			listCountValue -= 1;
		}
	}

	public void printAllListNode() {
		System.out.println("输出链表中的而所有数据：");
		current = head;
		for (int i = 0; i < listCountValue; i++) {
			System.out.println(current.value);
			current = current.next;
		}
	}
}
