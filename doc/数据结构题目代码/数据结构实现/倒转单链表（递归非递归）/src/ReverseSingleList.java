/**
 * Project Name:��ת�������ݹ�ǵݹ飩
 * File Name:ReverseSingleList.java
 * Package Name:
 * Date:2015-3-28����10:01:06
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */
/**
 * @author luochengcheng ����һ��������
 */

// ���⣺
// ��һ����������������ͷ��β��ת���������磺 a -> b -> c ->d ���������� d -> c -> b -> a ��
// ������
// ����ÿһ��node�Ľṹ�ǣ�
// class Node {
// char value;
// Node next;
// }
// ��Ϊ�ڶ�������з�ת��ʱ����Ҫ����ÿһ��node�ġ�next��ֵ�����ǣ��ڸ��� next ��ֵǰ��
// ������Ҫ���� next ��ֵ�����������޷����������ԣ�������Ҫ����ָ��ֱ�ָ��ǰһ���ڵ�ͺ�һ���ڵ㣬
// ÿ�����굱ǰ�ڵ㡰next��ֵ���º󣬰������ڵ������ƣ�ֱ���������ڵ㡣
// �������£�
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
// �������ʹ�õ��Ƿǵݹ鷽ʽ���������Ҳ����ͨ���ݹ�ķ�ʽ������������£�
// public Node reverse(Node current)
// {
// if (current == null || current.next == null) return current;
// Node nextNode = current.next;
// current.next = null;
// Node reverseRest = reverse(nextNode);
// nextNode.next = current;
// return reverseRest;
// }
// �ݹ�ķ�����ʵ�Ƿǳ��ɵģ������õݹ��ߵ������ĩ�ˣ�Ȼ���ٸ���ÿһ��node��next ֵ (���뵹���ڶ���)��
// ������Ĵ����У� reverseRest ��ֵû�иı䣬Ϊ����������һ��node�����ԣ���ת��
// ���ǿ��Եõ��������head��

class Node {
	// ����
	private int record;
	// ָ����һ������
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
 * @author luochengcheng ���ַ�ʽʵ�ֵ�����ķ�ת(�ݹ顢��ͨ) ����ǿ�ҽ����Ա�����ֽ�ͱʸ��Ŵ��뻭ͼ(�������)
 */
public class ReverseSingleList {
	/**
	 * �ݹ飬�ڷ�ת��ǰ�ڵ�֮ǰ�ȷ�ת�����ڵ�
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
	 * ����������ǰ�ڵ����һ���ڵ㻺�����ĵ�ǰ�ڵ�ָ��
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
		// ��ԭ�����ͷ�ڵ����һ���ڵ���Ϊnull���ٽ���ת���ͷ�ڵ㸳��head
		head.setNextNode(null);
		head = pre;

		return head;
	}

	public static void main(String[] args) {
		Node head = new Node(0);
		Node tmp = null;
		Node cur = null;
		// ����һ������Ϊ10����������ͷ�ڵ����head
		for (int i = 1; i < 10; i++) {
			tmp = new Node(i);
			if (1 == i) {
				head.setNextNode(tmp);
			} else {
				cur.setNextNode(tmp);
			}
			cur = tmp;
		}
		// ��ӡ��תǰ������
		Node h = head;
		while (null != h) {
			System.out.print(h.getRecord() + " ");
			h = h.getNextNode();
		}
		// ���÷�ת����
		head = reverse2(head);
		System.out.println("\n**************************");
		// ��ӡ��ת��Ľ��
		while (null != head) {
			System.out.print(head.getRecord() + " ");
			head = head.getNextNode();
		}
	}
}
