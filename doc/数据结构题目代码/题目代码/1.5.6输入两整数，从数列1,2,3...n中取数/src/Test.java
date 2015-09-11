import java.util.LinkedList;

/**
 * Project Name:1.5.6������������������1,2,3...n��ȡ�� File Name:Test.java Package Name:
 * Date:2015-3-23����11:00:32 Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn
 * All Rights Reserved.
 * 
 */

public class Test  {
	private static LinkedList<Integer> list = new LinkedList<Integer>();

	/**
	 * ���˼·�� 1.�����жϣ����n>m,��n�д���m���������ܲ�����ϣ���ʱ��n=m��
	 *  2.��������n������n==m�������������������
	 * 3.��n�����������⣺nû�м��룬ȡn=n-1,m=m,�ݹ飻 4.n���룬ȡn=n-1,m=m-n,�ݹ顣 5.������
	 * 
	 * @param sum
	 * @param n
	 */
	public static void findSum(int sum, int n) {
		if (n < 1 || sum < 1)
			return;
		if (sum > n) {
			list.add(n);
			findSum(sum - n, n - 1);// n���룬ȡn=n-1,m=m-n
			list.pop();
			findSum(sum, n - 1); // nû�м��룬ȡn=n-1,m=m
		} else {
			System.out.print(sum); // sum < n ,ֱ�����n�Ϳ���������
			for (int i = 0; i < list.size(); i++)
				System.out.print("  " + list.get(i));
			System.out.println();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 10;
		int n = 6;
		findSum(sum, n);
	}
}
