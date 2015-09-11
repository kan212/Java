/**
 * Project Name:1.7.1寻找丑数
 * File Name:Test.java
 * Package Name:
 * Date:2015-3-26下午12:50:14
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-26 下午12:50:14 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
public class Test {
	private double findTheMinNumber(double a, double b, double c) {
		// 找到a,b之间最小的
		double temp = a < b ? a : b;
		// 找到abc之间最小的返回
		return temp < c ? temp : c;
	}

	private void findUgly(int n) {
		double[] ugly = new double[n];
		ugly[0] = 1;
		int index = 1;
		int index2 = 0;
		int index3 = 0;
		int index5 = 0;
		while (index < n) {
			double var = this.findTheMinNumber(ugly[index2] * 2,
					ugly[index3] * 3, ugly[index5] * 5);
			if (var == ugly[index2] * 2) {
				++index2;
			}
			if (var == ugly[index3] * 3) {
				++index3;
			}
			if (var == ugly[index5] * 5) {
				++index5;
			}
			ugly[index++] = var;
		}

		// 循环输出所有的丑数
		for (int i = 1; i <= ugly.length; i++) {

			System.out.println("the " + i + " th ugly number is " + ugly[i - 1]);
		}
	}

	public static void main(String[] args) {
		Test find = new Test();
		find.findUgly(2012);
	}
}
