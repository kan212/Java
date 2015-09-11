/**
 * Project Name:��ⵥ�����Ƿ��л�
 * File Name:Test.java
 * Package Name:
 * Date:2015-4-1����9:45:49
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-4-1 ����9:45:49 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
class Node {
	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
	}

	public void append(Node n) {
		Node p = this;
		while (p.next != null) {
			p = p.next;
		}
		p.next = n;
	}
}

public class Test {
	public static void main(String[] args) {

		// ��������ָ��
		Node p1, p2;

		Node n = new Node(1);
		n.append(new Node(2));
		n.append(new Node(3));
		n.append(new Node(4));
		n.append(new Node(5));
		n.append(new Node(6));
		n.append(new Node(7));
		Node n8 = new Node(8);
		n.append(n8);
		n8.next = n;

		// ������ǻ���p2һ�������꣬����ǻ���p1,p2һ������
		p1 = n;
		p2 = n;
		boolean flag = true;
		while (n.next != null) {
			if (p1.next != null) {
				p1 = p1.next;
				System.out.println("p1 :" + p1.data);
			}
			if (p2.next.next != null) {
				p2 = p2.next.next;
				System.out.println("p2 :" + p2.data);
			}
			if (p2.next.next == null) {
				break;
			}

			if (p1 != null && p2 != null && p1.data == p2.data) {
				System.out.println("�ǻ���");
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("���ǻ�");
	}
}