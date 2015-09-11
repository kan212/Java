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
     //转换子树(核心)
	public void swapChild(BiTree b) {
		if (b == null) {
			return;
		}
		if (b.left != null && b.right != null) {
			BiTree temp = b.right;
			b.right = b.left;
			b.left = temp;
		} else if (b.left != null) {
			b.right = new BiTree(b.left.data);
			b.left = null;

		} else if (b.right != null) {
			b.left = new BiTree(b.right.data);
			b.right = null;
		}
		swapChild(b.left);
		swapChild(b.right);
	}
}

public class Test {
	public static void main(String[] args) {
		BiTree tree = new BiTree(8);
		tree.add(new BiTree(6));
		tree.add(new BiTree(10));
		tree.add(new BiTree(5));
		tree.add(new BiTree(7));
		tree.add(new BiTree(9));
		tree.add(new BiTree(11));
		tree.swapChild(tree);

		// 中序遍历
		tree.travel();

	}

}
