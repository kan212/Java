import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Project Name:1.6.8һ�������г�����������֮�⣬�������־���������
 * File Name:Test.java
 * Package Name:
 * Date:2015-3-24����2:39:29
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-24 ����2:39:29 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
public class Test {
	public static void findNum(int[] arr) {

		int result = 0;
		for (int i = 0; i < arr.length; i++) {// �������൱�����������Ľ��
			result ^= arr[i];
		}
		// �ҳ����������ĵ�һ������λ��
		int count = 1;
		int i = 1;
		while (true) {
			if ((result & i) == 1) {
				break;
			}
			result >> 1;
			count << 1;
		}
		// �������λ�ð�����ֳ�����
		int num1 = 0;
		int num2 = 0;

		for (int j = 0; j < arr.length; j++) {
			if ((arr[i] & count) == 0) {
				num1 ^= arr[j];
			} else {
				num2 ^= arr[j];
			}
		}

		System.out.println("num1=" + num1 + " num2=" + num2);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 5, 4, 3 };
		findNum(arr);
		
	}
}
