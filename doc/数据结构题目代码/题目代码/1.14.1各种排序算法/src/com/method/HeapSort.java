/**
 * Project Name:1.14.1���������㷨
 * File Name:HeapSort.java
 * Package Name:com.method
 * Date:2015-3-25����4:08:40
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

package com.method;

import com.Sort;

/**
 * ClassName:HeapSort <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-25 ����4:08:40 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
// ������
public class HeapSort implements Sort {

	@Override
	public void sort(int[] arr) {
		heapSort(arr);
	}

	public void heapSort(int[] arr) {
		// ������ʼ��,�����һ����Ҷ�ӽڵ㿪ʼ�Ƚϣ�arr.length-1��/2
		for (int i = (arr.length - 1) / 2; i >= 0; i--)
			heapOne(arr, arr.length, i);
		// ������Ѷ��ߵ���
		int n = arr.length;
		while (n > 0) {
			System.out.print(arr[0] + " ");// ����Ѷ�Ԫ��
			arr[0] = arr[n - 1];// ���һ��Ԫ���ƶ����Ѷ�
			n--;
			heapOne(arr, n, 0);
		}
	}

	// �ڵ�K����ɸѡ
	// a:�����ݣ�n:������Ч���ݸ��� k:��ɸѡ�ڵ�
	public void heapOne(int[] arr, int n, int k) {
		// n:�ַ�������
		// k:��ǰ�ڵ�
		int k1 = 2 * k + 1;// ���Ӽ��㹫ʽ
		int k2 = 2 * k + 2;// �Һ��Ӽ��㹫ʽ
		if (k1 >= n && k2 >= n)
			return; // �Ѿ���Ҷ����

		int a1 = Integer.MAX_VALUE;
		int a2 = Integer.MAX_VALUE;

		if (k1 < n)
			a1 = arr[k1];// ����
		if (k2 < n)
			a2 = arr[k2];// �Һ���

		if (arr[k] <= a1 && arr[k] <= a2)
			return;// �Ѿ����϶ѵ�Ҫ��

		// �ҵ����Һ�������С�ģ���������
		if (a1 < a2) {
			int t = arr[k];
			arr[k] = arr[k1];
			arr[k1] = t;
			heapOne(arr, n, k1);// ����ɸѡ����
		} else {
			int t = arr[k];
			arr[k] = arr[k2];
			arr[k2] = t;
			heapOne(arr, n, k2);// ����ɸѡ����
		}
	}
}
