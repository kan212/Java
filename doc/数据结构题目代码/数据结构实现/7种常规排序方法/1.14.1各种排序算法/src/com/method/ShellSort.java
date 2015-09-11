/**
 * Project Name:1.14.1各种排序算法
 * File Name:ShellSort.java
 * Package Name:com.method
 * Date:2015-3-25上午11:35:55
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

package com.method;

import com.Sort;

/**
 * ClassName:ShellSort <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-25 上午11:35:55 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
// 希尔排序
public class ShellSort implements Sort {

	@Override
	public void sort(int[] arr) {

		int j;
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < arr.length; i++) {
				int tmp = arr[i];
				for (j = i; j >= gap && tmp < arr[j - gap]; j -= gap) {
					arr[j] = arr[j - gap];
				}
				arr[j] = tmp;
			}
		}

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}

}
