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
// 插入排序
public class InsertionSort implements Sort {

	@Override
	public void sort(int[] arr) {

		if (arr == null || arr.length <= 0) {
			return;
		}
    //从第二个数开始与前一个数两两比较，如果大于前一个数，则继续往下，如果小于前一个数那就与之前的数交换位置
	//再继续跟之前的之前的数比较直到不小于之前的数为止
		//时间复杂度： n2;
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			for (int j = i - 1; j >= 0 && temp < arr[j]; j--) {
				arr[j + 1] = arr[j];
				arr[j] = temp;
			}
		}
		
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}
