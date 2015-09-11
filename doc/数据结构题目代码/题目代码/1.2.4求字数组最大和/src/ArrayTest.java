/**
 * Project Name:1.2.4ArrayMax File Name:ArrayTest.java Package Name:
 * Date:2015-3-20上午10:39:00 Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn
 * All Rights Reserved.
 * 
 */

class GIntArrDispose {
	public static int getMaxChild(int[] intArr) {
		if (null == intArr || 0 == intArr.length) {
			// 抛异常
			throw new NullPointerException(
					"GIntArrDispose.getMaxChild(int[]):传入没有内容的数组");
		}
		int result = 0;// 最大和
		int tempSum = 0;// 累加和
		int maxNegative = intArr[0];// 数组最大值
		// 1, -2, 3, 10, -4, 7, 2, -5
		// tempsum:18
		// result:18
		for (int i = 0; i < intArr.length; i++) {
			if (tempSum <= 0) {
				tempSum = intArr[i];// 始终保持为正，可以理解为排除最大子数组左边所有数的和
			} else {
				tempSum += intArr[i];
			}
			if (tempSum > result) {
				result = tempSum;// 始终保持最大，可以理解为排除最大子数组右边所有数的和
			}
			if (intArr[i] > maxNegative) {
				maxNegative = intArr[i];
			}
		}
		if (maxNegative < 0) {
			return maxNegative;// 所有数都为负数，只返回最大的一个数
		}
		return result;
	}

	public static synchronized void print(int[] intArr) {
		if (null == intArr || 0 == intArr.length) {
			// 抛异常
			throw new NullPointerException(
					"GIntArrDispose.print(int[]):传入没有内容的数组");
		}
		System.out.println("数组：");
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
			System.out.println("最大数组和为：" + GIntArrDispose.getMaxChild(intArr));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
