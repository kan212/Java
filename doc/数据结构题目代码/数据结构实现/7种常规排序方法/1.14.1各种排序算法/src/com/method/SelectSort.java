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
public class SelectSort implements Sort {

	@Override
	public void sort(int[] arr) {

		if (arr == null || arr.length <= 0) {
			return;
		}

		//�ӵ�һ������ʼ��ȷ����ǰ���±�Ϊmin,Ȼ����֮������Ƚϣ����֮�������ֵС�ڵ�ǰ����
		//��ôminתΪ��С�������꣬��һ��Ƚ���֮��ֱ�ӿ���ǰ�������±��ǲ���min,������Ǽ���
		//���£�������ǣ���ֱ�Ӱѵ�ǰ������minΪ�±��������
		//ʱ�临�Ӷȣ�n2;
		
		for (int i = 0; i < arr.length; i++) {
			int min = i; /* ����ǰ�±궨��Ϊ��Сֵ�±� */

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) { /* �����С�ڵ�ǰ��Сֵ�Ĺؼ��� */
					min = j; /* ���˹ؼ��ֵ��±긳ֵ��min */
				}
			}
			if (i != min) {/* ��min������i��˵���ҵ���Сֵ������ */
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
