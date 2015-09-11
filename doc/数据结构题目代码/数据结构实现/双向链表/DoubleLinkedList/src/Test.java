/**
 * Project Name:DoubleLinkedList File Name:Test.java Package Name:
 * Date:2015-3-19ÏÂÎç3:32:41 Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn
 * All Rights Reserved.
 * 
 */

class DoubleLinkedList {
	private int data;
	private DoubleLinkedList front;// Ç°Çý
	private DoubleLinkedList last;// ºó¼Ì

	public DoubleLinkedList(int data) {
		this.data = data;
	}

	public void append(DoubleLinkedList x) {
		DoubleLinkedList list = this;
		while (list.last != null) {
			list = list.last;
		}
		list.last = x;
		x.front = list;
	}

	public void show() {
		DoubleLinkedList list = this;
		while(list != null){
			System.out.println(list.data);
			list = list.last;
		}
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DoubleLinkedList getFront() {
		return front;
	}

	public void setFront(DoubleLinkedList front) {
		this.front = front;
	}

	public DoubleLinkedList getLast() {
		return last;
	}

	public void setLast(DoubleLinkedList last) {
		this.last = last;
	}
	
	
}

public class Test {
	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList(10);
		list.append(new DoubleLinkedList(20));
		list.append(new DoubleLinkedList(30));
		list.append(new DoubleLinkedList(40));
		list.append(new DoubleLinkedList(50));
		DoubleLinkedList d = new DoubleLinkedList(60);
		list.append(d);
		list.show();
		System.out.println("----------------");
		System.out.println(d.getFront().getData());
	}
}
