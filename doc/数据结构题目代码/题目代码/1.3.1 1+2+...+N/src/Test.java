/**
 * Project Name:1.3.1 1+2+...+N
 * File Name:Test.java
 * Package Name:
 * Date:2015-3-21����3:52:34
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-21 ����3:52:34 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
//˼����1+2+������+N ��1���ض�Ҫʹ��ѭ������ѭ��while for �ݹ��� ֻ�еݹ���ʹ��
                 // 2��


// ʹ�þ�̬����
public class Test {
	static int sum = 0;

	boolean theMethod(int n) {
		sum += n;
		return (n - 1 <= 0 || theMethod(n - 1)); // ���Ĵ��룬��n-1С��0,��ݹ����
	}

	public static void main(String[] args) {
		new Test().theMethod(100);
		System.out.println(Test.sum);
	}
}
