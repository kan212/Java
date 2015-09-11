package com.zht;


class BiTree {
	private int data;
	private BiTree left;
	private BiTree right;

	public BiTree(int x) {
		data = x;
	}

	public void add(BiTree x) {
		if (x.data < this.data) {
			if (left == null) {
				left = x;
			} else {
				left.add(x);
			}
		} else {
			if (right == null) {
				right = x;
			} else {
				right.add(x);
			}
		}
	}

	// 中序遍历
	public void travel() {
		if (left != null)
			left.travel();
		System.out.println(data);
		if (right != null)
			right.travel();
	}

	// 判断树的深度
	public int treeDepth(BiTree tree) {
		int tLeft = 0, tRight = 0;
		if (tree.left != null) {
			tLeft = treeDepth(tree.left);

		}
		if (tree.right != null)
			tRight = treeDepth(tree.right);

		return (tLeft > tRight) ? (tLeft + 1) : (tRight + 1);
	}
}

public class Test {
	public static void main(String[] args) {
		BiTree tree = new BiTree(20);
		tree.add(new BiTree(15));
		tree.add(new BiTree(24));
		tree.add(new BiTree(9));
		tree.add(new BiTree(29));
		tree.add(new BiTree(4));
		tree.add(new BiTree(12));
		// 中序遍历
		tree.travel();

	}

}
