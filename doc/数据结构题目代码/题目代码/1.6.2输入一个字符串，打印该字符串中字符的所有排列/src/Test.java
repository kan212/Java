/**
 * Project Name:1.6.2����һ���ַ�������ӡ���ַ������ַ�����������
 * File Name:Test.java
 * Package Name:
 * Date:2015-3-24����11:15:23
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-24 ����11:15:23 <br/>
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
				//����λ��
				char temp = str[j];
				str[j] = str[i];
				str[i] = temp;

				permutation(str, i + 1);
                //��ԭλ��
				temp = str[j];
				str[j] = str[i];
				str[i] = temp;
			}
		}
	}
}
