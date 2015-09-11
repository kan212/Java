import java.util.Stack;

/**
 * Project Name:1.6.5输入一个链表的头结点，然后反向输出每个节点
 * File Name:Test.java
 * Package Name:
 * Date:2015-3-24下午12:39:39
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-24 下午12:39:39 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
class Node {
	private int data;
	private Node next;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node(int data) {
		this.data = data;
	}

	public void add(Node n) {
		n.next = this.next;
		this.next = n;
	}

}

public class Test {
	public static void main(String[] args) {
		Node head = new Node(1);
		head.add(new Node(7));
		head.add(new Node(6));
		head.add(new Node(5));
		head.add(new Node(4));
		head.add(new Node(3));
		head.add(new Node(2));
		
		
		
		
		

		Stack<Integer> s = new Stack<Integer>();
		System.out.println("push:"+head.getData()+" ");
		s.push(head.getData());
		while (true) {
			if (head.getNext() != null) {
				System.out.println("push:"+head.getNext().getData()+" ");
				s.push(head.getNext().getData());
				head = head.getNext();
			}else{
				break;
			}
		}
        while (!s.empty()) { 
            System.out.println(s.pop()); 
    }
	}
}
