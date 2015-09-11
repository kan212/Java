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

	// �������,ʹ��LinkedList���ݽṹ��ģ�����
	public void levelOrder(BiTree root) {
		if (root == null) {
			System.out.println("\n������Ϊ�գ�");
			return;
		}
		System.out.println("\n���Ƕ����������Ĳ���������:");
		LinkedList<BiTree> queue = new LinkedList<BiTree>();
		queue.add(root); // ���ڵ������
		while (queue.size() != 0) {
			BiTree node = queue.removeFirst(); // �õ���ɾ�����еĵ�һ���ڵ�
			System.out.print(node.data + " ");
			if (node.left != null) { // �ýڵ���������
				queue.add(node.left);
			}
			if (node.right != null) { // �ýڵ���Һ������
				queue.add(node.right);
			}
		}
		System.out.println();
	}

	// �������
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
		// �������
		//tree.travel();

	}

}
