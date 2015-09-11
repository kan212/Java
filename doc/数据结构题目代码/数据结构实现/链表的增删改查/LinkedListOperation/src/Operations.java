/**
 * Project Name:LinkedListOperation
 * File Name:Operations.java
 * Package Name:
 * Date:2015-3-19下午3:15:36
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
  一系列的操作	 
 */
public class Operations {
   //增
	public static void add(LinkedList list,LinkedList x){
		x.next = list.next;
		list.next = x;
	}
	//删
	public static void delete(LinkedList list,LinkedList x){
		list.next = x.next;
	}
	//改
	//...
	//查
	public static void show(LinkedList list){
		LinkedList p = list;
		while(p != null){
			System.out.println(p.data);
			p = p.next;
		}
	}
}
