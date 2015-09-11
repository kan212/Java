/**
 * Project Name:1.5.10输入正数N，输出和为N连续正数序列
 * File Name:Test.java
 * Package Name:
 * Date:2015-3-24上午9:51:58
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

import java.util.ArrayList;
//分析：
//我们用两个数small和big分别表示序列的最小值和最大值。
//首先把small初始化为 1，big初始化为 2。
//如果从small到big的序列的和大于n的话，我们向右移动small，相当于从序列中去掉较小的数字。
//如果从small到big的序列的和小于n的话，我们向右移动big，相当于向序列中添加big的下一个数字。
//一直到small等于(1+n)/2，因为序列至少要有两个数字。

public class Test {
	// 输出一到n中连续和为n的正整数
	public static void getAns(int n) {
		int beg = 1;
		int sum = 1;
		int cur = 1;

		while (beg <= n / 2 + 1) {

			if (sum == n) {
				for (int k = beg; k <= cur; k++) {
					System.out.print(k + " ");
				}
				System.out.println();
				sum = sum - beg;
				beg++;
				cur++;
				sum += cur;

			}
			if (sum > n) {

				sum = sum - beg;
				beg++;

			} else {
				cur++;
				sum += cur;
			}
			// System.out.println("beg"+beg+"cur"+cur+"sum"+sum);

		}

	}

	public static void main(String[] args) {
		getAns(15);

	}

}
