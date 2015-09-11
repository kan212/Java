/**
 * Project Name:1.14.1各种排序算法
 * File Name:BubbleSort.java
 * Package Name:com
 * Date:2015-3-25上午10:17:32
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

package com.method;

import com.Sort;

/**
 * ClassName:BubbleSort <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-25 上午10:17:32 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
// 冒泡排序
public class BubbleSort implements Sort {

	@Override
	public void sort(int[] arr) {

		// 从第一个元素开始往后比较N-1次:
		for (int i = 1; i < arr.length; i++) {
			// 选定当前元素与之后所有元素一一比较
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
