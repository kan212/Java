package com.link;

//链表类
class LinkedList{
	//里面包含数据和指针
	private String data;
	private LinkedList next;
	public LinkedList(String data) {
		this.data = data;
	}
	//添加数据
	public void append(LinkedList x){
		LinkedList p = this;
		while(p.next != null){
			p = p.next;
		}
		p.next = x;
	}
	//插入数据
	public void add(LinkedList x){
		x.next = next;
		next = x;
	}
	//显示数据
	public void show(){
		LinkedList p = this;
		while(p!= null){
			System.out.println(p.data);
			p = p.next;
		}
	}
	
}

public class SingleLinkedList {
   public static void main(String[] args) {
	   //头指针指向10
	LinkedList head = new LinkedList("10");
	//向链表中添加几个数据
	head.append(new LinkedList("30"));
	head.append(new LinkedList("40"));
	head.append(new LinkedList("50"));
	//做插入操作
	head.add(new LinkedList("20"));
	head.show();
}
}
