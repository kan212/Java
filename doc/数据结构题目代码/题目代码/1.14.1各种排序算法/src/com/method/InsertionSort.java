/**
 * Project Name:1.14.1���������㷨
 * File Name:SelectSort.java
 * Package Name:com
 * Date:2015-3-25����10:45:20
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

package com.method;

import com.Sort;

/**
 * ClassName:SelectSort <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-25 ����10:45:20 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
// ��������
public class InsertionSort implements Sort {

	@Override
	public void sort(int[] arr) {

		if (arr == null || arr.length <= 0) {
			return;
		}
    //�ӵڶ�������ʼ��ǰһ���������Ƚϣ��������ǰһ��������������£����С��ǰһ�����Ǿ���֮ǰ��������λ��
	//�ټ�����֮ǰ��֮ǰ�����Ƚ�ֱ����С��֮ǰ����Ϊֹ
		//ʱ�临�Ӷȣ� n2;
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
