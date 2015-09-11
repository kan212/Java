import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Project Name:map_wideTravel
 * File Name:Test.java
 * Package Name:
 * Date:2015-3-22下午4:38:52
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-22 下午4:38:52 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
public class Test {
	public static void main(String[] args) {
		int[][] g = { 
				{ 0, 1, 1, 0, 0, 0, 0 }, 
				{ 1, 0, 0, 1, 0, 0, 1 },
				{ 1, 0, 0, 0, 0, 1, 1 }, 
				{ 0, 1, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 1, 0, 1, 1 }, 
				{ 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 1, 1, 0, 1, 0, 0 } };
		
		//广度优先遍历
		List list = new ArrayList();//等待遍历
		Set set = new HashSet();//已经遍历节点的集合
		
		list.add(0);//从0开始遍历
		
		while(true){
			if(list.isEmpty()) 
				break;
			
			int node = (Integer) list.get(0);
			System.out.println(node);
			set.add(node);
			list.remove(0);
			
			for (int i = 0; i < g[node].length; i++) {
				if(g[node][i] == 1 && !set.contains(i) && list.indexOf(i)<0){
					list.add(i);
				}
			}
		}
	}
}
