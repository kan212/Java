/**
 * Project Name:1.14.1���������㷨
 * File Name:MergeSort.java
 * Package Name:com.method
 * Date:2015-3-25����3:26:11
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

package com.method;

import com.Sort;

/**
 * ClassName:MergeSort <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-25 ����3:26:11 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
/**
 * �鲢���� ���:�����������������ϣ������ϲ���һ���µ������ ���Ѵ��������з�Ϊ���ɸ������У�ÿ��������������ġ�Ȼ���ٰ����������кϲ�Ϊ������������
 * ʱ�临�Ӷ�ΪO(nlogn) �ȶ�����ʽ
 * 
 * @param arr
 *            ����������
 * @return �����������
 */
public class MergeSort implements Sort {

	@Override
	public void sort(int[] arr) {
		sort(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void sort(int[] arr, int low, int high) {
		int mid = (low + high) / 2;
		if (low < high) {
			// ���
			sort(arr, low, mid);
			// �ұ�
			sort(arr, mid + 1, high);
			// ���ҹ鲢
			merge(arr, low, mid, high);
		}
	}

	public void merge(int[] arr, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		int i = low;// ��ָ��
		int j = mid + 1;// ��ָ��
		int k = 0;

		// �ѽ�С�������Ƶ���������
		while (i <= mid && j <= high) {
			if (arr[i] < arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}

		// �����ʣ�������������
		while (i <= mid) {
			temp[k++] = arr[i++];
		}

		// ���ұ߱�ʣ�������������
		while (j <= high) {
			temp[k++] = arr[j++];
		}

		// ���������е�������arr����
		for (int k2 = 0; k2 < temp.length; k2++) {
			arr[k2 + low] = temp[k2];
		}
	}
}
