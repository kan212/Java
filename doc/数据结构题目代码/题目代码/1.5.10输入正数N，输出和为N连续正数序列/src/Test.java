/**
 * Project Name:1.5.10��������N�������ΪN������������
 * File Name:Test.java
 * Package Name:
 * Date:2015-3-24����9:51:58
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

import java.util.ArrayList;
//������
//������������small��big�ֱ��ʾ���е���Сֵ�����ֵ��
//���Ȱ�small��ʼ��Ϊ 1��big��ʼ��Ϊ 2��
//�����small��big�����еĺʹ���n�Ļ������������ƶ�small���൱�ڴ�������ȥ����С�����֡�
//�����small��big�����еĺ�С��n�Ļ������������ƶ�big���൱�������������big����һ�����֡�
//һֱ��small����(1+n)/2����Ϊ��������Ҫ���������֡�

public class Test {
	// ���һ��n��������Ϊn��������
	public static void getAns(int n) {
		int beg = 1;
		int sum = 1;
		int cur = 1;

		while (beg <= n / 2 + 1) {

			if (sum == n) {
				for (int k = beg; k <= cur; k++) {
					System.out.print(k + " ");
				}
				System.out.println();
				sum = sum - beg;
				beg++;
				cur++;
				sum += cur;

			}
			if (sum > n) {

				sum = sum - beg;
				beg++;

			} else {
				cur++;
				sum += cur;
			}
			// System.out.println("beg"+beg+"cur"+cur+"sum"+sum);

		}

	}

	public static void main(String[] args) {
		getAns(15);

	}

}
