/**
 * Project Name:1.3.6�ַ������ҵ���һ��ֻ����һ�ε��ַ�
 * File Name:Test.java
 * Package Name:
 * Date:2015-3-22����10:13:20
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-22 ����10:13:20 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
public class Test {
	public static void main(String[] args) {
		String str = "abaccdeffb";
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
}
