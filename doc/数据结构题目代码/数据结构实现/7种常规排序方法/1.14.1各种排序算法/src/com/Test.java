/**
 * Project Name:1.14.1各种排序算法
 * File Name:Test.java
 * Package Name:com
 * Date:2015-3-25上午10:36:38
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

package com;

import com.method.BubbleSort;
import com.method.HeapSort;
import com.method.InsertionSort;
import com.method.MergeSort;
import com.method.QuickSort;
import com.method.SelectSort;
import com.method.ShellSort;

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-25 上午10:36:38 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
public class Test {
	public static void main(String[] args) {
		int[] arr = { 49, 38, 65, 97, 76, 13, 27, 50 };
		Sort bubbleSort = new BubbleSort();
		Sort selectSort = new SelectSort();
		Sort insertionSort = new InsertionSort();
		Sort shellSort = new ShellSort();
		Sort quickSort = new QuickSort();
		Sort mergeSort = new MergeSort();
		Sort heapSort = new HeapSort();
		heapSort.sort(arr);
	}
}
