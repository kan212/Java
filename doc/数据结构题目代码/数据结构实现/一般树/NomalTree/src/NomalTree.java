import java.util.ArrayList;
import java.util.List;

/**
 * Project Name:NomalTree
 * File Name:NomalTree.java
 * Package Name:
 * Date:2015-3-17下午4:01:16
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:NomalTree <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015-3-17 下午4:01:16 <br/>
 * @author   acer
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class NomalTree {

	public List<Node> list = new ArrayList<Node>();
	
	class Node{
		private String data;//数据
		private String parent;//父节点
	}

	//添加
	public void add(String parent,String child){
		Node n = new Node();
		n.data = child;
		n.parent = parent;
		list.add(n);
	}
	
	//获取父节点
	public String getParent(String child){
	     for (int i = 0; i < list.size(); i++) {
			if(list.get(i).data.equals(child)) 
				return list.get(i).parent;
		}
	     return "null";
	}
	//获取子节点
	public List<String> getChild(String parent){
		List<String> lst = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).parent.equals(parent))
				lst.add(list.get(i).data);
		}
		return lst;
	}
	
	
	public static void main(String[] args) {
       		
        NomalTree t = new NomalTree();
        t.add("世界","亚洲");
        t.add("世界","欧洲");
        t.add("世界","美洲");
        t.add("亚洲","中国");
        t.add("亚洲","日本");
        t.add("亚洲","韩国");
        t.add("中国","北京");
        t.add("中国","上海");
        t.add("中国","深圳");
        //获取中国的子节点
        System.out.println(t.getParent("中国"));
        System.out.println("-------------------");
        System.out.println(t.getChild("中国"));
        
	}

}
