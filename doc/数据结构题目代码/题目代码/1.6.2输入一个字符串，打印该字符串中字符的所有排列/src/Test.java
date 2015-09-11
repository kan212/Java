/**
 * Project Name:1.6.2输入一个字符串，打印该字符串中字符的所有排列
 * File Name:Test.java
 * Package Name:
 * Date:2015-3-24上午11:15:23
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-24 上午11:15:23 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
public class Test {
	public static void main(String[] args) {
		String str = "abc";

		permutation(str.toCharArray(), 0);
	}

	public static void permutation(char[] str, int i) {
		if (i >= str.length)
			return;
		if (i == str.length - 1) {
			System.out.println(String.valueOf(str));
		} else {
			for (int j = i; j < str.length; j++) {
				//交换位置
				char temp = str[j];
				str[j] = str[i];
				str[i] = temp;

				permutation(str, i + 1);
                //还原位置
				temp = str[j];
				str[j] = str[i];
				str[i] = temp;
			}
		}
	}
}
