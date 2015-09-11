/**
 * Project Name:1.2.8�ж����������ǲ��Ƕ������ĺ������ File Name:Test.java Package Name:
 * Date:2015-3-20����8:41:37 Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn
 * All Rights Reserved.
 * 
 */

class BTree {
	private int value;
	private BTree left;
	private BTree right;

	public BTree(int value) {
		this.value = value;
	}

	public void addNode(BTree x) {
		if (x.value < this.value) {
			if (left == null) {
				left = x;
			} else {
				left.addNode(x);
			}
		} else {
			if (right == null) {
				right = x;
			} else {
				right.addNode(x);
			}
		}
	}
	//ǰ�����
	public void travel1(){
		System.out.print(value+" ");
		if(left != null) left.travel1();
		if(right != null) right.travel1();
	}
	//�������
	public void travel2(){
		if(left != null) left.travel2();
		System.out.print(value+" ");
		if(right != null) right.travel2();
	}
	//�������
	public void travel3(){
		if(left != null) left.travel3();
		if(right != null) right.travel3();
		System.out.print(value+" ");
	}
}

public class Test {
	public static void main(String[] args) {
         BTree t = new BTree(8);
         t.addNode(new BTree(6));
         t.addNode(new BTree(10));
         t.addNode(new BTree(5));
         t.addNode(new BTree(7));
         t.addNode(new BTree(9));
         t.addNode(new BTree(11));
         t.travel2();
	}
}
