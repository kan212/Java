class BiTree {
	private int data;
	private BiTree left;
	private BiTree right;
	
	

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BiTree getLeft() {
		return left;
	}

	public void setLeft(BiTree left) {
		this.left = left;
	}

	public BiTree getRight() {
		return right;
	}

	public void setRight(BiTree right) {
		this.right = right;
	}

	public BiTree(int x) {
		data = x;
	}

	public void add(BiTree x) {
		if(x == null){
			return;
		}
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
	
	//中序遍历
	public void travel(){
		if(left != null)left.travel();
		System.out.println(data);
		if(right != null)right.travel();
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
		BiTree tree = new BiTree(10);
		tree.add(new BiTree(6));
		tree.add(new BiTree(14));
		tree.add(new BiTree(4));
		tree.add(new BiTree(12));
		tree.add(new BiTree(16));
		System.out.println(tree.treeDepth(tree));

	}

}
