/**
 * Project Name:1.2.4ArrayMax File Name:ArrayTest.java Package Name:
 * Date:2015-3-20����10:39:00 Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn
 * All Rights Reserved.
 * 
 */

class GIntArrDispose {
	public static int getMaxChild(int[] intArr) {
		if (null == intArr || 0 == intArr.length) {
			// ���쳣
			throw new NullPointerException(
					"GIntArrDispose.getMaxChild(int[]):����û�����ݵ�����");
		}
		int result = 0;// ����
		int tempSum = 0;// �ۼӺ�
		int maxNegative = intArr[0];// �������ֵ
		// 1, -2, 3, 10, -4, 7, 2, -5
		// tempsum:18
		// result:18
		for (int i = 0; i < intArr.length; i++) {
			if (tempSum <= 0) {
				tempSum = intArr[i];// ʼ�ձ���Ϊ�����������Ϊ�ų��������������������ĺ�
			} else {
				tempSum += intArr[i];
			}
			if (tempSum > result) {
				result = tempSum;// ʼ�ձ�����󣬿������Ϊ�ų�����������ұ��������ĺ�
			}
			if (intArr[i] > maxNegative) {
				maxNegative = intArr[i];
			}
		}
		if (maxNegative < 0) {
			return maxNegative;// ��������Ϊ������ֻ��������һ����
		}
		return result;
	}

	public static synchronized void print(int[] intArr) {
		if (null == intArr || 0 == intArr.length) {
			// ���쳣
			throw new NullPointerException(
					"GIntArrDispose.print(int[]):����û�����ݵ�����");
		}
		System.out.println("���飺");
		for (int v : intArr) {
			System.out.print(v + " ");
		}
		System.out.println();
	}
}

public class ArrayTest {
	public static void main(String[] args) {
		int[] intArr = new int[] { 1, -2, 3, 10, -4, 7, 2, -5 };
		try {
			GIntArrDispose.print(intArr);
			System.out.println("��������Ϊ��" + GIntArrDispose.getMaxChild(intArr));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
