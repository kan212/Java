/**
 * Project Name:1.14.1各种排序算法
 * File Name:SelectSort.java
 * Package Name:com
 * Date:2015-3-25上午10:45:20
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

package com.method;

import com.Sort;

/**
 * ClassName:SelectSort <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-25 上午10:45:20 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
public class SelectSort implements Sort {

	@Override
	public void sort(int[] arr) {

		if (arr == null || arr.length <= 0) {
			return;
		}

		//从第一个数开始，确定当前数下标为min,然后与之后的数比较，如果之后的数的值小于当前的数
		//那么min转为较小数的坐标，等一遍比较完之后，直接看当前的数的下标是不是min,如果是那继续
		//往下，如果不是，则直接把当前的数跟min为下标的数互换
		//时间复杂度：n2;
		
		for (int i = 0; i < arr.length; i++) {
			int min = i; /* 将当前下标定义为最小值下标 */

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) { /* 如果有小于当前最小值的关键字 */
					min = j; /* 将此关键字的下标赋值给min */
				}
			}
			if (i != min) {/* 若min不等于i，说明找到最小值，交换 */
				int tmp = arr[min];
				arr[min] = arr[i];
				arr[i] = tmp;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
