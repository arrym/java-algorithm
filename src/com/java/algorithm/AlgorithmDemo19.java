package com.java.algorithm;

import java.util.Scanner;

import org.junit.Test;
/**
 * 单链表
 * 
 * @author soul
 * 
 */
public class AlgorithmDemo19 {
	public static void main(String arg[]) // 程序入口
	{
		if ((arg.length == 0) || (arg.length > 10))
			System.out.println("长度超过限制或者缺少参数");
		else {
			MyLinkList ll = new MyLinkList(arg); // 创建一个链表
			ll.print(); // 先输出该链表（运行到这一步抛出异常）
			ll.reverse(); // 倒置该链表
			ll.print(); // 再输出倒置后的链表
			String data[] = new String[10];
			int i;
			for (i = 0; i < ll.size(); i++) {
				data[i] = ll.get(i); // 将链表中的数据放入数组
			}
			// sort(data);// 按升序排列data中的数据（有没有现成的排序函数？）
			for (i = 0; i < ll.size(); i++) {
				System.out.print(data[i] + ";"); // 输出数组中元素
			}
			System.out.println();
			MyStack s = new MyStack(); // 创建堆栈实例s
			for (i = 0; i < ll.size(); i++) {
				s.push(data[i]); // 将数组元素压栈
			}
			while (!s.empty()) {
				System.out.print(s.pop() + ";"); // 再将堆栈里的元素弹出
			}
		}
	}
}

class Node_1 // 节点类，单链表上的节点
{

	String data; // 数据域，存放String类的数据
	Node_1 next; // 指向下一个节点

	Node_1(String data) {
		this.data = data; // 构造函数
	}

	String get() {
		return data; // 返回数据
	}
}

class MyLinkList // 链表类
{

	Node_1 first; // 头节点
	int size; // 链表长度

	MyLinkList(String arg[]) {
		// Node first = new Node("head");//生成头节点
		first = new Node_1("head"); // J.F. 这里不需要定义局部变量 first
		// 如果定义了局部变量，那成员变量 first 就一直没有用上
		// 所以，它一直为空
		size = 0;
		Node_1 p = first;
		for (int i = 0; i < arg.length; i++) // 将arg数组中的元素分别放入链表中
		{
			Node_1 q = new Node_1(arg[i]);
			q.next = p.next; // 每一个节点存放一个arg数组中的元素
			p.next = q;
			p = p.next;
			size++;
		}
	}

	MyLinkList() // 无参数构造函数
	{
		// Node first = new Node("head");
		first = new Node_1("head"); // J.F. 这里犯了和上一个构造方法同样的错误
		size = 0;
	}

	int size() // 返回链表长度
	{
		return size;
	}

	void insert(Node_1 a, int index) // 将节点a 插入链表中的第index个位置
	{
		Node_1 temp = first;
		for (int i = 0; i < index; i++) {
			temp = temp.next;// 找到插入节点的前一节点
		}
		a.next = temp.next; // 插入节点
		temp.next = a;
		size++;
	}

	Node_1 del(int index) // 删除第index个节点，并返回该值
	{
		Node_1 temp = first;
		for (int i = 0; i < index; i++) {
			temp = temp.next;// 找到被删除节点的前一节点
		}
		Node_1 node = temp.next;
		temp.next = node.next;
		size--; // 删除该节点，链表长度减一
		return node;
	}

	void print() // 在屏幕上输出该链表（这段程序总是出错，不知道错在哪里）
	{
		Node_1 temp = first;
		for (int i = 1; i < size; i++) // 将各个节点分别在屏幕上输出
		{
			temp = temp.next;
			System.out.print(temp.get() + "->");
		}
	}

	void reverse() // 倒置该链表
	{
		for (int i = 0; i < size; i++) {
			insert(del(size - 1), 0); // 将最后一个节点插入到最前
			// J.F. 最后一个节点的 index 应该是 size - 1
			// 因为第一个节点的 index 是 0
		}
	}

	String get(int index) // 查找第index个节点，返回其值
	{
		if (index >= size) {
			return null;
		}
		Node_1 temp = first;
		for (int i = 0; i < index; i++) {
			temp = temp.next;// 找到被查找节点的前一节点
		}
		return temp.next.get();
	}
}

class MyStack // 堆栈类，用单链表实现
{

	MyLinkList tmp;
	Node_1 temp;

	MyStack() {
		// MyLinkList tmp = new MyLinkList();
		tmp = new MyLinkList(); // J.F. 和 MyLinkList 构造方法同样的错误
	}

	void push(String a) // 压栈，即往链表首部插入一个节点
	{
		Node_1 temp = new Node_1(a);
		tmp.insert(temp, 0);
	}

	String pop() // 出栈，将链表第一个节点删除
	{
		Node_1 a = tmp.del(0);
		return a.get();
	}

	int size() {
		return tmp.size();
	}

	boolean empty() // 判断堆栈是否为空
	{
		if (tmp.size() == 0)
			return false;
		else
			return true;
	}
}