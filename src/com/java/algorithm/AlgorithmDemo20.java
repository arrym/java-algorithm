package com.java.algorithm;

import java.util.Scanner;

import org.junit.Test;
/**
 * 双端链表
 * 
 * @author soul
 * 
 */
public class AlgorithmDemo20 {
	public static void main(String[] args) {
		FirstLastList theList = new FirstLastList();
		theList.insertFirst(22); // insert at front
		theList.insertFirst(44);
		theList.insertFirst(66);
		theList.insertLast(11); // insert at rear
		theList.insertLast(33);
		theList.insertLast(55);
		theList.displayList(); // display the list
		theList.deleteFirst(); // delete first two items
		theList.deleteFirst();
		theList.displayList(); // display again
	}
}

class Link_1 {

	public int iData = 0;
	public Link_1 next = null;

	public Link_1(int iData) {
		this.iData = iData;
	}

	public void display() {
		System.out.print(iData + " ");
	}
}

class FirstLastList {

	private Link_1 first = null;
	private Link_1 last = null;

	public FirstLastList() {
		first = null;
		last = null;
	}

	public void insertFirst(int key) {
		Link_1 newLink = new Link_1(key);

		if (this.isEmpty())
			last = newLink;
		newLink.next = first;
		first = newLink;
	}

	public void insertLast(int key) {
		Link_1 newLink = new Link_1(key);

		if (this.isEmpty())
			first = newLink;
		else
			last.next = newLink;
		last = newLink;
	}

	public Link_1 deleteFirst() {
		Link_1 temp = first;

		if (first.next == null)
			last = null;
		first = first.next;
		return temp;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void displayList() {
		System.out.print("List (first-->last): ");
		Link_1 current = first;
		while (current != null) {
			current.display();
			current = current.next;
		}
		System.out.println("");
	}
}