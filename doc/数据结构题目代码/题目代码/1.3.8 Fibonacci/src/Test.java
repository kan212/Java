import java.io.ObjectInputStream.GetField;

/**
 * Project Name:1.3.8 Fibonacci
 * File Name:Test.java
 * Package Name:
 * Date:2015-3-22ионГ11:00:47
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-22 ионГ11:00:47 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
public class Test {

	public static int getFibonacciItem(int n) {
		if (n == 0) {
			return 0;
		} else if (n < 2) {
			return n;
		} else if (n >= 2) {
			return getFibonacciItem(n-1) + getFibonacciItem(n-2);
		}
		return 0;
	}

	public static void main(String[] args) {
        System.out.println(getFibonacciItem(3));
	}
}
