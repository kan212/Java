/**
 * Project Name:1.14.1���������㷨
 * File Name:QuickSort.java
 * Package Name:com.method
 * Date:2015-3-25����12:28:49
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

package com.method;

import com.Sort;

/**
 * ClassName:QuickSort <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-25 ����12:28:49 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
public class QuickSort implements Sort {

	@Override
	public void sort(int[] arr) {
		if (arr.length > 0) {// �鿴�����Ƿ�Ϊ��
			quickSort(arr, 0, arr.length - 1);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public void quickSort(int[] list, int low, int high) {
		if (low < high) {
			int middle = getMiddle(list, low, high); // ��list�������һ��Ϊ��
			quickSort(list, low, middle - 1); // �Ե��ֱ���еݹ�����
			quickSort(list, middle + 1, high); // �Ը��ֱ���еݹ�����
		}

	}

	public int getMiddle(int[] list, int low, int high) {
		int tmp = list[low]; // ����ĵ�һ����Ϊ����
		while (low < high) {
			while (low < high && list[high] > tmp) {
				high--;
			}
			list[low] = list[high]; // ������С�ļ�¼�Ƶ��Ͷ�
			while (low < high && list[low] < tmp) {
				low++;
			}
			list[high] = list[low]; // �������ļ�¼�Ƶ��߶�
		}
		list[low] = tmp; // �����¼��β
		return low; // ���������λ��
	}

}
