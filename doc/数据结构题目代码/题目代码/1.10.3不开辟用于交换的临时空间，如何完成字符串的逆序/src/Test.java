/**
 * Project Name:1.10.3不开辟用于交换的临时空间，如何完成字符串的逆序
 * File Name:Test.java
 * Package Name:
 * Date:2015-3-29上午11:00:08
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-29 上午11:00:08 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
public class Test {
	public static void main(String[] args) {
		// 使用了由于交换的临时空间
		String str = "123456789";
		// char[] c = str.toCharArray();
		// int low = 0;
		// int high = str.length() - 1;
		// for (int i = 0; i < c.length; i++) {
		// if (low < high) {
		// char tmp = c[low];
		// c[low] = c[high];
		// c[high] = tmp;
		// }
		// low++;
		// high--;
		// }
		// System.out.println(new String(c));

		StringBuffer sb = new StringBuffer("123456789");
		int low = 0;
		int high = sb.length() - 1;

		sb.reverse();
		System.out.println(sb.toString());
	}
}
