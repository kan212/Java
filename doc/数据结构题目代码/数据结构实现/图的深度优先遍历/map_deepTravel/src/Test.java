/**
 * Project Name:map_deepTravel
 * File Name:Test.java
 * Package Name:
 * Date:2015-3-21下午10:16:58
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-21 下午10:16:58 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
public class Test {
	
	public static void deepTravel(int[][] a ,int[] color, int k){
		System.out.println(k);
		color[k] = 1;
		for (int i = 0; i < a[k].length; i++) {
			if(a[k][i] == 1 && color[i] == 0){
				deepTravel(a, color, i);
			}
		}
	}
	
	public static void main(String[] args) {
		//图的表示
		int[][] a = { 
				{ 0, 1, 1, 1, 0 },
				{ 1, 0, 1, 1, 1 }, 
				{ 1, 1, 0, 0, 0 },
				{ 1, 1, 0, 0, 0 }, 
				{ 0, 1, 0, 0, 0 },
		};
		int[] color = new int[a.length];
		//0:从零这个节点开始遍历
		deepTravel(a,color,0);
	}
}
