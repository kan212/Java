/**
 * Project Name:1.4.8计算1到N的十进制数中1的出现次数
 * File Name:Test.java
 * Package Name:
 * Date:2015-3-22下午2:35:59
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-22 下午2:35:59 <br/>
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
			//先判断是否包含1
			String s = String.valueOf(i);
			if (s.contains("1")) {
				//判断此数包含几个1
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
