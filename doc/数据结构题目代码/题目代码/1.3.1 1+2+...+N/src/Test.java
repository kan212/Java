/**
 * Project Name:1.3.1 1+2+...+N
 * File Name:Test.java
 * Package Name:
 * Date:2015-3-21下午3:52:34
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-21 下午3:52:34 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
//思考：1+2+。。。+N ：1、必定要使用循环：而循环while for 递归中 只有递归能使用
                 // 2、


// 使用静态变量
public class Test {
	static int sum = 0;

	boolean theMethod(int n) {
		sum += n;
		return (n - 1 <= 0 || theMethod(n - 1)); // 核心代码，若n-1小于0,则递归结束
	}

	public static void main(String[] args) {
		new Test().theMethod(100);
		System.out.println(Test.sum);
	}
}
