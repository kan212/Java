import java.util.ArrayList;
import java.util.List;

/**
 * Project Name:1.2.5BTreePath File Name:Test.java Package Name:
 * Date:2015-3-20����1:38:30 Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn
 * All Rights Reserved.
 * 
 */

class BTree {
	private Integer value;
	private BTree left;
	private BTree right;

	public BTree(int value) {
		this.value = value;
	}

	// ��ӽڵ�
	public void addNode(BTree t) {
		if (t.value < this.value) {
			if (left == null) {
				left = t;
			} else {
				left.addNode(t);
			}
		} else {
			if (right == null) {
				right = t;
			} else {
				right.addNode(t);
			}
		}
	}
	
	public synchronized void showSumPath(int sumValue) {
		showSumPath(this, new ArrayList<Integer>(), 0, sumValue);
}

/**
 * @param �ڵ�
 * @param ·���洢����
 * @param ��ʱ·���ĺ�
 * @param ·���ĺ�
 */
private void showSumPath(BTree node, List<Integer> path,
		int tempSum, int sumValue) {
	if (null == node) {
		return;
	}

	tempSum += node.value;
	path.add(node.value);

	boolean isLeaf = (null == node.left && null == node
			.right); // �Ƿ�ΪҶ��

	if (isLeaf && tempSum == sumValue) { // ����
		System.out.print("sumPath(" + sumValue + "): ");
		for (int i : path) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// �����ߣ�������
	showSumPath(node.left, path, tempSum, sumValue);
	showSumPath(node.right, path, tempSum, sumValue);

	// ��֤�ݹ���ɺ󷵻ظ��ڵ�ʱ·���Ǹ���㵽���ڵ��·����֮��������ڵ�������ӽڵ㣬û���򷵻ص�үү�ڵ�...
	path.remove(path.size() - 1); // ɾ����ǰ�ڵ�
	// ��󲹳�һ�£����path����ָ����ǻ������͵Ļ�����仰��û���ˣ����ڵݹ���������û���ˣ����㷨Ҳ���ˣ��������������һ��tempSum+=XXX;�Խ��û���κ�Ӱ�죬����Ӱ��ݹ�returnʱ����������Ĳ���
}

	// �������
//	public void travel() {
//		if (left != null)
//			left.travel();
//		System.out.println(value);
//		if (right != null)
//			right.travel();
//	}
}

public class Test {
	public static void main(String[] args) {
		BTree tree = new BTree(10);
		tree.addNode(new BTree(5));
		tree.addNode(new BTree(12));
		tree.addNode(new BTree(4));
		tree.addNode(new BTree(7));
		//tree.travel();
		tree.showSumPath(22);
	}
}
