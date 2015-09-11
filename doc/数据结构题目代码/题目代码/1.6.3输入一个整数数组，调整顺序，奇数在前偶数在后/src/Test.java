import java.util.LinkedList;
import java.util.Stack;

/**
 * Project Name:1.6.3输入一个整数数组，调整顺序，奇数在前偶数在后
 * File Name:Test.java
 * Package Name:
 * Date:2015-3-24上午11:52:16
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-24 上午11:52:16 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
public class Test {
	public static int cur = 0;
	public static int index = 0;

	public static void search(int[] arr) {
		if (index < arr.length) {
			if (arr[index] % 2 == 1) {
				int temp = arr[cur];
				arr[cur] = arr[index];
				arr[index] = temp;

			} else {
				index++;
				search(arr);
			}
		} else {
			return;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 3, 5, 7, 9, 10, 6, 8, 11 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				cur++;
				continue;
			} else {
				cur = i;
				index = i;
				search(arr);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
