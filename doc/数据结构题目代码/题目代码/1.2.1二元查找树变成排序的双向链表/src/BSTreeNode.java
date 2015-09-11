public class BSTreeNode {
	private Integer value;//ֵ
	private BSTreeNode left;//������
	private BSTreeNode right;//������

	static BSTreeNode head;
	static BSTreeNode temp;

	/*
	 * ����ڵ�
	 */
	public void add(int insertValue) {
		if (null == value)
			value = insertValue;
		else if (insertValue <= value) {
			if (null == left) {
				left = new BSTreeNode();
				left.setValue(insertValue);
			} else
				left.add(insertValue);
		} else {
			if (null == right) {
				right = new BSTreeNode();
				right.setValue(insertValue);
			} else
				right.add(insertValue);
		}
	}

	/*
	 * ���������ӡ������
	 */
	public void list() {
		if (null == this.value)
			return;
		if (null != left)
			left.list();
		System.out.println(value);
		if (null != right)
			right.list();
	}

	/*
	 * �����������
	 */
	public BSTreeNode convertToLinkList() {

		if (null != left)
			left.convertToLinkList();
		addNodeToList(this);
		if (null != right)
			right.convertToLinkList();
		return null;
	}

	/*
	 * 
	 * ��ӽڵ㵽˫������β��
	 */
	public void addNodeToList(BSTreeNode node) {
		node.left = temp;
		if (null != temp) {
			temp.right = node; 
		} else {
			head = node;
		}
		temp = node;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public BSTreeNode getLeft() {
		return left;
	}

	public void setLeft(BSTreeNode left) {
		this.left = left;
	}

	public BSTreeNode getRight() {
		return right;
	}

	public void setRight(BSTreeNode right) {
		this.right = right;
	}

	public static void main(String args[]) {
		BSTreeNode tree = new BSTreeNode();
		tree.add(10);
		tree.add(6);
		tree.add(14);
		tree.add(4);
		tree.add(8);
		tree.add(12);
		tree.add(16);
		tree.list();
		tree.convertToLinkList();
		BSTreeNode node = tree.head;
		System.out.println("Linklist:");
        
		while (null != node) {
			System.out.println(node.getValue());
			node = node.getRight();
		}

	}
}
