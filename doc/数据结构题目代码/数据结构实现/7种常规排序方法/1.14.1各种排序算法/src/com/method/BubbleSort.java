/**
 * Project Name:1.14.1���������㷨
 * File Name:BubbleSort.java
 * Package Name:com
 * Date:2015-3-25����10:17:32
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

package com.method;

import com.Sort;

/**
 * ClassName:BubbleSort <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-25 ����10:17:32 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
// ð������
public class BubbleSort implements Sort {

	@Override
	public void sort(int[] arr) {

		// �ӵ�һ��Ԫ�ؿ�ʼ����Ƚ�N-1��:
		for (int i = 1; i < arr.length; i++) {
			// ѡ����ǰԪ����֮������Ԫ��һһ�Ƚ�
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
