import java.util.LinkedList;

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

	// 层序遍历,使用LinkedList数据结构来模拟队列
	public void levelOrder(BiTree root) {
		if (root == null) {
			System.out.println("\n二叉树为空！");
			return;
		}
		System.out.println("\n这是二叉排序树的层序遍历结果:");
		LinkedList<BiTree> queue = new LinkedList<BiTree>();
		queue.add(root); // 根节点先入队
		while (queue.size() != 0) {
			BiTree node = queue.removeFirst(); // 得到并删除队列的第一个节点
			System.out.print(node.data + " ");
			if (node.left != null) { // 该节点的左孩子入队
				queue.add(node.left);
			}
			if (node.right != null) { // 该节点的右孩子入队
				queue.add(node.right);
			}
		}
		System.out.println();
	}

	// 中序遍历
	public void travel() {
		if (left != null)
			left.travel();
		System.out.println(data);
		if (right != null)
			right.travel();
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
		tree.levelOrder(tree);
		// 中序遍历
		//tree.travel();

	}

}
