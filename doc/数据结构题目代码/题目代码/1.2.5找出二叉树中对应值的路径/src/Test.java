import java.util.ArrayList;
import java.util.List;

/**
 * Project Name:1.2.5BTreePath File Name:Test.java Package Name:
 * Date:2015-3-20下午1:38:30 Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn
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

	// 添加节点
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
 * @param 节点
 * @param 路径存储集合
 * @param 临时路径的和
 * @param 路径的和
 */
private void showSumPath(BTree node, List<Integer> path,
		int tempSum, int sumValue) {
	if (null == node) {
		return;
	}

	tempSum += node.value;
	path.add(node.value);

	boolean isLeaf = (null == node.left && null == node
			.right); // 是否为叶子

	if (isLeaf && tempSum == sumValue) { // 满足
		System.out.print("sumPath(" + sumValue + "): ");
		for (int i : path) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// 向左走，向右走
	showSumPath(node.left, path, tempSum, sumValue);
	showSumPath(node.right, path, tempSum, sumValue);

	// 保证递归完成后返回父节点时路径是根结点到父节点的路径，之后遍历父节点的其他子节点，没有则返回到爷爷节点...
	path.remove(path.size() - 1); // 删除当前节点
	// 最后补充一下，如果path不是指针而是基本类型的话，这句话就没用了（放在递归调用下面就没用了），算法也废了，比如在这里加入一句tempSum+=XXX;对结果没有任何影响，不会影响递归return时其他函数里的参数
}

	// 中序遍历
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
