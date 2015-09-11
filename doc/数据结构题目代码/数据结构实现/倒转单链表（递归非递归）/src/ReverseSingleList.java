/**
 * Project Name:倒转单链表（递归非递归）
 * File Name:ReverseSingleList.java
 * Package Name:
 * Date:2015-3-28下午10:01:06
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */
/**
 * @author luochengcheng 定义一个单链表
 */

// 问题：
// 给一个单向链表，把它从头到尾反转过来。比如： a -> b -> c ->d 反过来就是 d -> c -> b -> a 。
// 分析：
// 假设每一个node的结构是：
// class Node {
// char value;
// Node next;
// }
// 因为在对链表进行反转的时候，需要更新每一个node的“next”值，但是，在更新 next 的值前，
// 我们需要保存 next 的值，否则我们无法继续。所以，我们需要两个指针分别指向前一个节点和后一个节点，
// 每次做完当前节点“next”值更新后，把两个节点往下移，直到到达最后节点。
// 代码如下：
// public Node reverse(Node current) {
// //initialization
// Node previousNode = null;
// Node nextNode = null;
//
// while (current != null) {
// //save the next node
// nextNode = current.next;
// //update the value of "next"
// current.next = previousNode;
// //shift the pointers
// previousNode = current;
// current = nextNode;
// }
// return previousNode;
// }
//
// 上面代码使用的是非递归方式，这个问题也可以通过递归的方式解决。代码如下：
// public Node reverse(Node current)
// {
// if (current == null || current.next == null) return current;
// Node nextNode = current.next;
// current.next = null;
// Node reverseRest = reverse(nextNode);
// nextNode.next = current;
// return reverseRest;
// }
// 递归的方法其实是非常巧的，它利用递归走到链表的末端，然后再更新每一个node的next 值 (代码倒数第二句)。
// 在上面的代码中， reverseRest 的值没有改变，为该链表的最后一个node，所以，反转后，
// 我们可以得到新链表的head。

class Node {
	// 变量
	private int record;
	// 指向下一个对象
	private Node nextNode;

	public Node(int record) {
		super();
		this.record = record;
	}

	public int getRecord() {
		return record;
	}

	public void setRecord(int record) {
		this.record = record;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
}

/**
 * @author luochengcheng 两种方式实现单链表的反转(递归、普通) 新手强烈建议旁边拿着纸和笔跟着代码画图(便于理解)
 */
public class ReverseSingleList {
	/**
	 * 递归，在反转当前节点之前先反转后续节点
	 */
	public static Node reverse(Node head) {
		if (null == head || null == head.getNextNode()) {
			return head;
		}
		Node reversedHead = reverse(head.getNextNode());
		head.getNextNode().setNextNode(head);
		head.setNextNode(null);
		return reversedHead;
	}

	/**
	 * 遍历，将当前节点的下一个节点缓存后更改当前节点指针
	 * 
	 */
	public static Node reverse2(Node head) {
		if (null == head) {
			return head;
		}
		Node pre = head;
		Node cur = head.getNextNode();
		Node next;
		while (null != cur) {
			next = cur.getNextNode();
			cur.setNextNode(pre);
			pre = cur;
			cur = next;
		}
		// 将原链表的头节点的下一个节点置为null，再将反转后的头节点赋给head
		head.setNextNode(null);
		head = pre;

		return head;
	}

	public static void main(String[] args) {
		Node head = new Node(0);
		Node tmp = null;
		Node cur = null;
		// 构造一个长度为10的链表，保存头节点对象head
		for (int i = 1; i < 10; i++) {
			tmp = new Node(i);
			if (1 == i) {
				head.setNextNode(tmp);
			} else {
				cur.setNextNode(tmp);
			}
			cur = tmp;
		}
		// 打印反转前的链表
		Node h = head;
		while (null != h) {
			System.out.print(h.getRecord() + " ");
			h = h.getNextNode();
		}
		// 调用反转方法
		head = reverse2(head);
		System.out.println("\n**************************");
		// 打印反转后的结果
		while (null != head) {
			System.out.print(head.getRecord() + " ");
			head = head.getNextNode();
		}
	}
}
