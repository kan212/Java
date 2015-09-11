/**
 * Project Name:二分法查找
 * File Name:HalfSearch.java
 * Package Name:
 * Date:2015-3-23下午12:04:05
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:HalfSearch <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-23 下午12:04:05 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
public class HalfSearch {
	// 非递归实现
	public static int binary(int[] array, int value) {
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int middle = (low + high) / 2;
			if (value == array[middle]) {
				return middle;
			}
			if (value > array[middle]) {
				low = middle + 1;
			}
			if (value < array[middle]) {
				high = middle - 1;
			}
		}
		return -1;
	}

	// 递归实现
	public static int BinSearch(int[] array, int key, int low, int high) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (key == array[mid]) {
				return mid;
			}
			// 移动low和high
			else if (key < array[mid]) {
				return BinSearch(array, key, low, mid - 1);
			} else {
				return BinSearch(array, key, mid + 1, high);
			}
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
		int s = 7;
		// int index = binary(a, s);
		int index = BinSearch(a, s, 0, a.length - 1);
		System.out.println(s + "在数组中的下标是  " + index);

	}
}
