package com.java.algorithm;

import java.util.Scanner;

import org.junit.Test;
/**
 * 链表
 * 
 * @author soul
 * 
 */
public class AlgorithmDemo18 {

}

class Node {
	Object data;
	Node next;

	public Node(Object data) {
		setData(data);
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}
}

class Link {
	Node head;
	int size = 0;

	public void add(Object data) {
		Node n = new Node(data);
		if (head == null) {
			head = n;
		} else {
			Node current = head;
			while (true) {
				if (current.next == null) {
					break;
				}
				current = current.next;
			}
			current.next = n;
		}
		size++;
	}

	public void show() {
		Node current = head;
		if (current != null) {
			while (true) {
				System.out.println(current);
				if (current == null) {
					break;
				}
				current = current.next;
			}
		} else {
			System.out.println("link is empty");
		}
	}

	public Object get(int index) {
		return null;
	}

	public int size() {
		return size;
	}
}
