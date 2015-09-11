/**
 * 求二叉树节点最大距离 递归实现
 * 
 */
public class Test {
	public static int maxLen = 0;

	public static void main(String args[]) {
		TreeNode root = buildTree();
		getMaxLength(root);
		System.out.println(maxLen);
	}
   
	//相距最远的两个节点一定是叶子节点
	public static void getMaxLength(TreeNode root) {
		if (root == null)
			return;
		if (root.left != null) {
			getMaxLength(root.left);
			root.maxLeft = Math.max(root.left.maxLeft, root.left.maxRight) + 1;
		}
		if (root.right != null) {
			getMaxLength(root.right);
			root.maxRight = Math.max(root.right.maxLeft, root.right.maxRight) + 1;
		}
		maxLen = Math.max(maxLen, root.maxLeft + root.maxRight);
	}

	public static TreeNode buildTree() {
		TreeNode root = new TreeNode();

		TreeNode temp = new TreeNode();
		root.left = temp;

		temp = new TreeNode();
		root.right = temp;

		temp = new TreeNode();
		root.right.right = temp;

		temp = new TreeNode();
		root.left.right = temp;

		temp = new TreeNode();
		root.left.right.right = temp;

		return root;
	}
}

class TreeNode {
	int maxLeft = 0;
	int maxRight = 0;
	TreeNode left = null;
	TreeNode right = null;
}
