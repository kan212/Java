/**
 * Project Name:1.3.3输入一个按升序排列的数组和一个数字
 * File Name:Test.java
 * Package Name:
 * Date:2015-3-21下午4:44:20
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-21 下午4:44:20 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */

public class Test {

	public static void find(int[] arr, int sum) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] + arr[j] > sum) {
				j--;
			} else if (arr[i] + arr[j] < sum) {
				i++;
			} else {
				System.out.println(arr[i] + "+" + arr[j] + "=" + sum);
				return;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 7, 11, 15 };
		Test.find(arr, 18);
	}
}
