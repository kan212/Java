import java.util.Arrays;

/**
 * Project Name:1.3.9左移递减数列查找某一个数
 * File Name:Test.java
 * Package Name:
 * Date:2015-3-22上午11:17:52
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-22 上午11:17:52 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
// 题目：一个数组是由一个递减数列左移若干位形成的，比如{4，3，2，1，6，5}是由{6，5，4，3，2，1}左移两位形成的，在这种数组中查找某一个数。
// 分析：由于数组是由一个递减数列左移若干位形成的，所以将数组以中间为界分割成两个数组将得到这样两个数组，一个数组是单调递减的，一个是由一个递减数列左移若干位形成的。接下来我们要确定要查找的数在两个数组中的哪个数组中，要查找的数若是在单调递减的数列中则在数列中进行二分查找，若要查找的数在第二个数列中则，继续第一步。
// 判断数组是否为单调数组可以用array[l]>= array[mid],若成立则是单调递减的数列否则不是。

public class Test {

//	public static int findNum(int[] arr, int num) {
//		int l = arr.length;
//		if (l % 2 == 0) {
//			l = l / 2;
//		} else {
//			l = l / 2 + 1;
//		}
//		int[] arr1 = Arrays.copyOfRange(arr, 0, l);
//		int[] arr2 = Arrays.copyOfRange(arr, l, arr.length);
//		if(arr1[arr1.length] >= arr1[arr1.length/2] ){
//			//单调数组
//		}
//	}

	public static void main(String[] args) {
		int arr[] = { 4, 3, 2, 1, 6, 5 };
		// 返回当前数字再数组中的下标
		//findNum(arr, 6);
	}
}
