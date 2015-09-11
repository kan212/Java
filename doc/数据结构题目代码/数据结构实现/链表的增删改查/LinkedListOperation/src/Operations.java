/**
 * Project Name:LinkedListOperation
 * File Name:Operations.java
 * Package Name:
 * Date:2015-3-19����3:15:36
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
  һϵ�еĲ���	 
 */
public class Operations {
   //��
	public static void add(LinkedList list,LinkedList x){
		x.next = list.next;
		list.next = x;
	}
	//ɾ
	public static void delete(LinkedList list,LinkedList x){
		list.next = x.next;
	}
	//��
	//...
	//��
	public static void show(LinkedList list){
		LinkedList p = list;
		while(p != null){
			System.out.println(p.data);
			p = p.next;
		}
	}
}
