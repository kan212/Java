/**
 * Project Name:1.2.7TurnOverWords
 * File Name:Test.java
 * Package Name:
 * Date:2015-3-20обнГ8:19:16
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015-3-20 обнГ8:19:16 <br/>
 * @author   acer
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class Test {
    public static void main(String[] args) {
		String words = "I am a student.";
		String[] arr = words.split(" ");
		StringBuilder sb= new StringBuilder();
		for (int i = arr.length-1 ; i >= 0; i--) {
			sb.append(arr[i]).append(" ");
		}
		String result = sb.substring(0, sb.length()-1).toString();
		System.out.println(result);
	}
}
