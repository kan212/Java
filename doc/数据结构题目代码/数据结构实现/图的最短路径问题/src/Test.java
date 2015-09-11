import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Project Name:图的最短路径问题
 * File Name:Test.java
 * Package Name:
 * Date:2015-3-22下午5:15:24
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-22 下午5:15:24 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
public class Test {

	static class Cell {
		int node;// 连接到哪个节点
		int weight;// 边的权值

		public Cell(int node, int weight) {
			this.node = node;
			this.weight = weight;
		}
	}

	public static void main(String[] args) {
		ArrayList[] g = new ArrayList[11];
		for (int i = 0; i < g.length; i++) {
			g[i] = new ArrayList<Cell>();
		}
		g[0].add(new Cell(1, 3));
		g[0].add(new Cell(4, 1));
		g[1].add(new Cell(2, 1));
		g[1].add(new Cell(6, 3));
		g[1].add(new Cell(9, 4));
		g[1].add(new Cell(5, 5));
		g[1].add(new Cell(0, 3));
		g[2].add(new Cell(1, 1));
		g[2].add(new Cell(3, 1));
		g[2].add(new Cell(6, 7));
		g[3].add(new Cell(2, 1));
		g[3].add(new Cell(10, 2));
		g[4].add(new Cell(0, 1));
		g[4].add(new Cell(5, 2));
		g[5].add(new Cell(4, 2));
		g[5].add(new Cell(1, 5));
		g[5].add(new Cell(7, 2));
		g[5].add(new Cell(8, 3));
		g[6].add(new Cell(2, 3));
		g[6].add(new Cell(3, 7));
		g[6].add(new Cell(8, 2));
		g[6].add(new Cell(10, 1));
		g[7].add(new Cell(5, 2));
		g[8].add(new Cell(5, 3));
		g[8].add(new Cell(6, 2));
		g[9].add(new Cell(1, 4));
		g[9].add(new Cell(10, 2));
		g[10].add(new Cell(3, 2));
		g[10].add(new Cell(6, 1));
		g[10].add(new Cell(9, 2));
		
		//求0号节点开始的所有最小路径
		Map map = new HashMap();//节点号----》最小路径值
		while(true){
			int min = Integer.MAX_VALUE;//最小路径值
			int min_no = -1;//对应的节点号
			//所有与0号节点邻接，并且不在map中的点 
			for (int i = 0; i < g[0].size(); i++) {
				Cell t = (Cell) g[0].get(i);
				if(map.get(t.node) == null && t.weight < min){
					min_no = t.node;
					min = t.weight;
				}
			}
			
			//与map中的点邻接所有不在map中的点
			Iterator it = map.keySet().iterator();
			while(it.hasNext()){
				int k = (Integer) it.next();
				int v = (Integer) map.get(k);//集合中的节点对应的最小路径值
				
				for (int i = 0; i < g[k].size(); i++) {
					Cell t = (Cell) g[k].get(i);
					if(map.get(t.node) == null && t.weight + v <min){
						min_no = t.node;
						min = t.weight + v;
					}
				}
			}
			
			if(min <Integer.MAX_VALUE){
				map.put(min_no, min);
			}else{
				break;
			}
		}
		System.out.println(map);
	}
}
