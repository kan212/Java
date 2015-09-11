/**
 * Project Name:Á´±í¹é²¢ÅÅÐò File Name:Solution.java Package Name:
 * Date:2015-3-28ÏÂÎç9:56:44 Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn
 * All Rights Reserved.
 * 
 */

// Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class Solution {
	public ListNode sortList(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}

		ListNode p = head;
		ListNode f = head.next;
		while (f.next != null && f.next.next != null) {// locate p at half of
														// the ListNode
			p = p.next;
			f = f.next.next;
		}

		ListNode h2 = sortList(p.next);
		p.next = null;

		return merge(sortList(head), h2);

	}

	public ListNode merge(ListNode h1, ListNode h2) {

		ListNode hn = new ListNode(-1);
		ListNode c = hn;

		while (h1 != null && h2 != null) {
			if (h1.val <= h2.val) {
				c.next = h1;
				h1 = h1.next;
			} else {
				c.next = h2;
				h2 = h2.next;
			}
			c = c.next;
		}

		if (h1 == null) {
			c.next = h2;
		} else {
			c.next = h1;
		}

		return hn.next;

	}
}
