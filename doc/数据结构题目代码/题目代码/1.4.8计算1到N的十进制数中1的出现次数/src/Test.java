/**
 * Project Name:1.4.8����1��N��ʮ��������1�ĳ��ִ���
 * File Name:Test.java
 * Package Name:
 * Date:2015-3-22����2:35:59
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-22 ����2:35:59 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
public class Test {
	public static void main(String[] args) {
		int n = 100;
		int num = 0;
		for (int i = 1; i < n+1; i++) {
			//���ж��Ƿ����1
			String s = String.valueOf(i);
			if (s.contains("1")) {
				//�жϴ�����������1
                 for (int j = 0; j < s.length(); j++) {
					if(s.charAt(j) == (char)(1+48)){
						num++;
					}
				}
			}
		}
		System.out.println(num);
	}
}
