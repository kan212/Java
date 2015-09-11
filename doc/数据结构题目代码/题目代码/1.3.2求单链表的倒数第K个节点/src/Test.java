/**
 * Project Name:1.3.2������ĵ�����K���ڵ� File Name:Test.java Package Name:
 * Date:2015-3-21����4:10:23 Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn
 * All Rights Reserved.
 * 
 */

class SingleLinkList {
	private int value;
	private SingleLinkList next;

	public SingleLinkList(int value) {
		this.value = value;
	}

	public void append(SingleLinkList x) {
		SingleLinkList p = this;
		while (p.next != null) {
			p = p.next;
		}
		p.next = x;
	}

	// ������ʾ
	public void show(int k) {
		SingleLinkList p = this;
		int i = 0;
		while (p != null) {
			i++;
			if (i == k) {
				System.out.println(p.value);
			}
			p = p.next;
		}
	}
}

public class Test {
	public static void main(String[] args) {
		SingleLinkList linkList = new SingleLinkList(10);
		linkList.append(new SingleLinkList(30));
		linkList.append(new SingleLinkList(40));
		linkList.append(new SingleLinkList(50));
		linkList.append(new SingleLinkList(60));
		linkList.append(new SingleLinkList(70));

		int k = 2;
		linkList.show(k);// ���������K���ڵ�
	}
}
