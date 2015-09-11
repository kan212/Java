/**
 * Project Name:1.7.2输入数字N，按序输出1到N位的10进制数
 * File Name:Print_1_To_NDight.java
 * Package Name:
 * Date:2015-3-27上午10:03:05
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:Print_1_To_NDight <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-27 上午10:03:05 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
public class Print_1_To_NDigit {
	/**
	 * Q65.输入数字n，按顺序输出从1最大的n位10进制数。比如输入3，则输出1、2、3一直到最大的3位数即999 1.使用字符串存放数字。int
	 * a=123 --> char[] a={'1','2','3'};
	 * 2.递归。设置好第n位（最高位，对应char数组的第0个元素）后，接下来设置第n-1,n-2.....位
	 * 3.打印时候，前面的0不输出，见printNumber(char[] number)
	 */
	public static void main(String[] args) {
		int n = 3;
		Print_1_To_NDigit p = new Print_1_To_NDigit();
		p.print(n);

	}

	public void print(int n) {
		char[] result = new char[n];
		printHelpRecursive(result, n, 0);
	}

	// from result[0] to result[n-1],set 0-9 into it
	public void printHelpRecursive(char[] result, int length, int index) {
		if (index == length) {
			printNumber(result);
		} else {
			for (int i = 0; i <= 9; i++) {
				result[index] = (char) ('0' + i);// 加个‘0’把int转为char
				printHelpRecursive(result, length, index + 1);
			}
		}
	}

	// don't print the prefix '0'.e.g,when "0012",print "12"
	//一位一位的拼进来
	public void printNumber(char[] re) {
		int len = re.length;
		boolean canPrint = false;
		for (int i = 0; i < len - 1; i++) {
			if (!canPrint && re[i] != '0') {
				canPrint = true;
			}
			if (canPrint) {
				System.out.print(re[i]);
			}
		}
		System.out.println(re[len - 1]);// the last bit is always printed.
	}
}
