/**
 * Project Name:1.7.2��������N���������1��Nλ��10������
 * File Name:Print_1_To_NDight.java
 * Package Name:
 * Date:2015-3-27����10:03:05
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:Print_1_To_NDight <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-27 ����10:03:05 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
public class Print_1_To_NDigit {
	/**
	 * Q65.��������n����˳�������1����nλ10����������������3�������1��2��3һֱ������3λ����999 1.ʹ���ַ���������֡�int
	 * a=123 --> char[] a={'1','2','3'};
	 * 2.�ݹ顣���úõ�nλ�����λ����Ӧchar����ĵ�0��Ԫ�أ��󣬽��������õ�n-1,n-2.....λ
	 * 3.��ӡʱ��ǰ���0���������printNumber(char[] number)
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
				result[index] = (char) ('0' + i);// �Ӹ���0����intתΪchar
				printHelpRecursive(result, length, index + 1);
			}
		}
	}

	// don't print the prefix '0'.e.g,when "0012",print "12"
	//һλһλ��ƴ����
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
