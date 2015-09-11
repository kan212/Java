/**
 * Project Name:LinkedListOperation File Name:Test.java Package Name:
 * Date:2015-3-19下午3:06:56 Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn
 * All Rights Reserved.
 * 
 */
class LinkedList {
	public int data;
	public LinkedList next;

	public LinkedList(int data) {
     this.data = data;
	}
	
	//尾部添加元素
	public void append(LinkedList x){
		LinkedList p = this;
		while(p.next != null){
			p = p.next;
		}
		//从头到尾循环，最终找到尾端
		p.next = x;
	}

}

public class Test {

	public static void main(String[] args) {
		//创建一个链表
		LinkedList list = new LinkedList(10);
		//在尾部添加其他的元素
		LinkedList cell = new LinkedList(30);
		list.append(cell);
		list.append(new LinkedList(40));
		list.append(new LinkedList(50));
		list.append(new LinkedList(60));
		//增加
		//Operations.add(list, new LinkedList(20));
		//删除
		//Operations.delete(list, cell);
        //显示
		Operations.show(list);
	}

}
